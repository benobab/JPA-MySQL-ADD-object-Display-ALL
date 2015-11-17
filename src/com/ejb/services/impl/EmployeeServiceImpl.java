package com.ejb.services.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.ejb.service.EmployeeService;
import com.jpa.entities.Employee;

@Stateless
public class EmployeeServiceImpl implements EmployeeService {

	@PersistenceContext(name = "EmployeeApp")
	private EntityManager em;

	@Override
	public void addEmployee(Employee emp) {
		em.persist(emp);
	}
	
	@Override
	public List<Employee> getAll(){
		Query query = em.createQuery("SELECT e FROM Employee e");
		return (ArrayList<Employee>) query.getResultList();
	}
}