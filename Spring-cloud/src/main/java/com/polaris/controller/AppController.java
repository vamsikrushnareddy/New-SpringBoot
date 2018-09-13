package com.polaris.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	@GetMapping("/greeting/{name}")
	public String greet(@PathVariable String name) {
		return "hi " + name + "Welcome to pivotal";
	}
}
