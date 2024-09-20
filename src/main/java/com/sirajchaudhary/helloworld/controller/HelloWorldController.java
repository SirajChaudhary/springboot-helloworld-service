package com.sirajchaudhary.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello World from Sameer Chaudhary";
	}
}
