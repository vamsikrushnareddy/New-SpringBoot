package com.java4s;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {

	@RequestMapping("/")
	public String testRest() {
		return "Default call..............!";
		//http://localhost:1005
	}
}
