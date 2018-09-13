package com.java4s.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java4s.model.Employee;

@RestController
public class SpringJava4sController {

	@RequestMapping("/")
	public String welcome() {
		return "Welcome to Spring Boot Tutorials";
		// http://localhost:9091
	}

	@RequestMapping("/hello")
	public String myData() {
		return "Hello Spring Boot";
		// http://localhost:9091/hello
	}

	// @RequestMapping(value = "/employee", method = RequestMethod.GET)
	@RequestMapping("/EmployeeS")
	public Employee firstPage() {

		System.out.println("Inside TestCOntroller............. Provider !");
		Employee emp = new Employee();
		emp.setName("VamsiReddy. Rachepalli...........!");
		emp.setDesignation("manager");
		emp.setEmpId("L25");
		emp.setSalary(3000);

		return emp;
	}
}
