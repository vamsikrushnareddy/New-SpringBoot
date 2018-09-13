package org.o7planning.sbangularjs.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@RequestMapping("/Test")
	public String welcome() {
		System.out.println("ok............!");
		return "index";
	}
}
