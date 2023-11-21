package com.springboot.repo;

//import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springboot.bean.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Integer> {



}