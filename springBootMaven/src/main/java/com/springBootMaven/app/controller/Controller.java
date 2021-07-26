package com.springBootMaven.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class Controller {

	
	@GetMapping("/test")
	public String helloMaven() {
		return "Hello world!";
	}
	
	@GetMapping(value="/{uuid}")
	public String helloMaven(@PathVariable(name = "uuid") String user){
		return "Hello " + user + "!";
	}
}
