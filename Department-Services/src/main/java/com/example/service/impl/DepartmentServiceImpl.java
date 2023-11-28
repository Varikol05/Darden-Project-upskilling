package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.DepartmentDto;
import com.example.entity.Department;
import com.example.repo.DepartmentRepository;
import com.example.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {
     
	@Autowired
	private DepartmentRepository departmentRepository;

   @Override
	public DepartmentDto saveDepartment(DepartmentDto departmentDto) {
		// convert department dto to department jpa entity
		Department department = new Department(
			departmentDto.getId(),
			departmentDto.getDepartmentName(),
			departmentDto.getDepartmentDescrption(),
			departmentDto.getDepartmentCode()
				);
	   
		Department savedDepartment = departmentRepository.save(department);
		
		DepartmentDto savedDepartmentDto = new DepartmentDto(
				savedDepartment.getId(),
				savedDepartment.getDepartmentName(),
				savedDepartment.getDepartmentDescrption(),
				savedDepartment.getDepartmentCode()
				
				);
				
		return savedDepartmentDto;
	}

@Override
public DepartmentDto getDepartmentByCode(String departmentCode) {
	Department department = departmentRepository.findByDepartmentCode(departmentCode);
	
DepartmentDto departmentDto = new DepartmentDto(
		department.getId(),
		department.getDepartmentName(),
		department.getDepartmentDescrption(),
		department.getDepartmentCode()
		
		);
	return departmentDto;
}
	
	

}
