package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{

	
	Department findByDepartmentCode(String departmentCode);
}
