package com.example.service;

import com.example.dto.APIResponseDto;
import com.example.dto.EmployeeDto;

public interface EmployeeService {
	
	EmployeeDto saveEmployee(EmployeeDto employeeDto);
	
	APIResponseDto getEmployeeById(Long employeeId);

}
