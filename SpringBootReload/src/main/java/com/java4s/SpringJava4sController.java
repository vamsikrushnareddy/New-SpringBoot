package com.java4s;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringJava4sController {

	@RequestMapping("/")
	public String welcome() {
		return "Welcome to Spring Boot Tutorials";
		// http://localhost:9091
	}

	@RequestMapping("/hello")
	public String myData() {
		return "Hello Spring Boot Reload Example.........!";
		// http://localhost:9091/hello
	}
}
