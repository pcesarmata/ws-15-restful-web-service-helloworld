package com.cesarmata.ws11restfulwebservicehelloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Cesar Mata.
 */
@RestController
public class HelloWorld {
	
	@GetMapping( path = "/hello-world")
	public String helloWorld() {
		return "Hello World!";
	}
}