package com.demo.SpringBoot.TodoList.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.SpringBoot.TodoList.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
