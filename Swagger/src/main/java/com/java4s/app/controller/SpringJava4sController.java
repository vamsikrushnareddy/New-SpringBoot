package com.java4s.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java4s.model.Employee;

@RestController
public class SpringJava4sController {

	
	
	@RequestMapping(method = RequestMethod.GET, value = "/api/javainuse")
	public String sayHello() {
		return "Swagger Hello World";
	}

	@RequestMapping("/hello")
	public String myData() {
		return "Hello Spring Boot";
		// http://localhost:9091/hello
	}

	// @RequestMapping(value = "/employee", method = RequestMethod.GET)
	@RequestMapping("/Employee")
	public Employee firstPage() {

		System.out.println("Inside TestCOntroller.............!");
		Employee emp = new Employee();
		emp.setName("emp1");
		emp.setDesignation("manager");
		emp.setEmpId("1");
		emp.setSalary(3000);

		return emp;
	}
}
