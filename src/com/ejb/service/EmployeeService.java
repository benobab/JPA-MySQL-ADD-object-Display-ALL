package com.ejb.service;

import java.util.List;

import com.jpa.entities.Employee;

public interface EmployeeService {

	public void addEmployee(Employee emp);
	public List<Employee> getAll();
}