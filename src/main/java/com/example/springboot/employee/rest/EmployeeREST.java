package com.example.springboot.employee.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.employee.entity.Employee;
import com.example.springboot.employee.entity.EmployeeDAO;

@RestController
public class EmployeeREST {
	
	
	private EmployeeDAO edao;
	
	
	@Autowired
	public EmployeeREST(EmployeeDAO eao)
	{
		edao = eao;
	}
	
	@GetMapping("/all")
	public List<Employee> getAllEmp()
	{
		
		return edao.getAll();
		
	}
	

}
