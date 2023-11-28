package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.dto.APIResponseDto;
import com.example.dto.DepartmentDto;
import com.example.dto.EmployeeDto;
import com.example.dto.OrganizationDto;
import com.example.entity.Employee;
import com.example.repo.EmployeeRepository;
import com.example.service.APIClient;
import com.example.service.EmployeeService;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
//	@Autowired
//	private RestTemplate restTemplate;
	
	@Autowired
	private WebClient webClient;
	
	@Autowired
	private APIClient apiClient; 
	
	@Override
	public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
		
		Employee employee = new Employee(
		   employeeDto.getId(),
		   employeeDto.getFirstName(),
		   employeeDto.getLastName(),
		   employeeDto.getEmail(),
		   employeeDto.getDepartmentCode(),
		   employeeDto.getOrganizationCode()
		   
				);
		
		Employee saveDEmployee = employeeRepository.save(employee);
		
		EmployeeDto savedEmployeeDto = new EmployeeDto(
			saveDEmployee.getId(),
			saveDEmployee.getFirstName(),
			saveDEmployee.getLastName(),
			saveDEmployee.getEmail(),
			saveDEmployee.getDepartmentCode(),
			saveDEmployee.getOrganizationCode()
				);
		
		return savedEmployeeDto;
	}


	@CircuitBreaker(name ="${spring.application.name}", fallbackMethod = "getDefaultDepartment")
	@Override
	public APIResponseDto getEmployeeById(Long employeeId) {
		
		Employee employee =  employeeRepository.findById(employeeId).get();
		
		DepartmentDto departmentDto =  apiClient.getDepartment(employee.getDepartmentCode());
		
		
		DepartmentDto departmenTDto = webClient.get()
		.uri("http://localhost:8080/api/departments/" + employee.getDepartmentCode())
		.retrieve()
		.bodyToMono(DepartmentDto.class)
		.block();
		
		
		OrganizationDto organizationDto = webClient.get()
		.uri("http://localhost:8083/api/organizations/" + employee.getOrganizationCode())	
		.retrieve()
		.bodyToMono(OrganizationDto.class)
		.block();
		
		
		
//		ResponseEntity<DepartmentDto> responseEntity =  restTemplate.getForEntity("http://localhost:8080/api/departments/" +employee.getDepartmentCode(), DepartmentDto.class);
//		
//		DepartmentDto departmentDto = responseEntity.getBody();
		
		EmployeeDto employeeDto = new EmployeeDto(
				employee.getId(),
				employee.getFirstName(),
				employee.getLastName(),
				employee.getEmail(),
				employee.getDepartmentCode(),
				employee.getOrganizationCode()
				);
		
		
		APIResponseDto apiResponseDto = new APIResponseDto();
		apiResponseDto.setEmployee(employeeDto);
		apiResponseDto.setDepartment(departmentDto);
		apiResponseDto.setOrganization(organizationDto);
		
		
		
		return apiResponseDto;
	}
	

	
	public APIResponseDto getDefaultDepartment(Long employeeId, Exception exception ) {

Employee employee =  employeeRepository.findById(employeeId).get();
		
//DepartmentDto departmentDto =  apiClient.getDepartment(employee.getDepartmentCode());

		DepartmentDto departmenTDto = new DepartmentDto();
		departmenTDto.setDepartmentCode("IT001");
		departmenTDto.setDepartmentName("R&D Department");
		departmenTDto.setDepartmentDescrption("RD001");
		departmenTDto.setDepartmentDescrption("Research and Development Department");
	
		OrganizationDto organizationDto = webClient.get()
				.uri("http://localhost:8083/api/organizations/" + employee.getOrganizationCode())	
				.retrieve()
				.bodyToMono(OrganizationDto.class)
				.block();
				
		
		
		EmployeeDto employeeDto = new EmployeeDto(
				employee.getId(),
				employee.getFirstName(),
				employee.getLastName(),
				employee.getEmail(),
				employee.getDepartmentCode(),
				employee.getOrganizationCode()
				);
		
		
		APIResponseDto apiResponseDto = new APIResponseDto();
		apiResponseDto.setEmployee(employeeDto);
		apiResponseDto.setDepartment(departmenTDto);
		apiResponseDto.setOrganization(organizationDto);
		
		
		return apiResponseDto;
	
	}
	


}
