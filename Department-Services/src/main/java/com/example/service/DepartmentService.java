package com.example.service;

import com.example.dto.DepartmentDto;

public interface DepartmentService {
	
	DepartmentDto saveDepartment(DepartmentDto departmentDto);
    
	DepartmentDto getDepartmentByCode(String code);
	
	
}
