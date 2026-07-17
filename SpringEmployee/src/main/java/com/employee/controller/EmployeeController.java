package com.employee.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.employee.bean.Employee;
@RestController
public class EmployeeController {
	
	//add a method to get all employees
	@GetMapping("/employees")
	public String  getAllEmployees() {
		return "All Employees";
	}
	//list of employees
	@GetMapping("/employees/list")
	public List<Employee> getEmployees(){
		List<Employee> employees=new ArrayList<Employee>();
		employees.add(new Employee(1,"java",25,"it",50000));
		employees.add(new Employee(2,"muksh",35,"software",60000));
		//count of employyees
		employees.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		 System.out.println(employees);
		 	 
		return employees;
		}
	

}
