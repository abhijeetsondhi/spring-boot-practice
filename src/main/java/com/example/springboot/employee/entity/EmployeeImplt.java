package com.example.springboot.employee.entity;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class EmployeeImplt implements EmployeeDAO{
	
	private EntityManager entityMngr;

	@Autowired
	public EmployeeImplt(EntityManager thisEntityMngr) {
		entityMngr = thisEntityMngr;
	}


	@Override
	@Transactional
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		
		Session currentSess = entityMngr.unwrap(Session.class);
		
		Query <Employee> query = currentSess.createQuery("from Employee",Employee.class);
		
		List<Employee> employees = query.getResultList();
		
		return employees;
	}

}
