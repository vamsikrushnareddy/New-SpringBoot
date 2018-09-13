package com.polaris.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RestApplication {

	public static void main(String[] args) {
		System.out.println("Before..!");
		SpringApplication.run(RestApplication.class, args);
		System.out.println("After..........!");
	}

	@RequestMapping
	public String rest1() {
		System.out.println("Inside. ok..........!");
		return "index";
	}
}
