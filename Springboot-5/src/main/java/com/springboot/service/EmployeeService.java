package com.springboot.service;

import java.util.List;

import com.springboot.bean.Employee;

public interface EmployeeService {
	
	 public List<Employee> showAllEmployee();
	    public Employee showById(int id);
	    public Employee addEmployee(Employee employee);
	    public Employee updateEmployee(Employee e);
	    public void deleteEmployee(int id);



	}


