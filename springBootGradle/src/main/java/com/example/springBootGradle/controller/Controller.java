package com.example.springBootGradle.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("")
public class Controller {
	
	
	@GetMapping("/test")
    public String helloGradle() {
        return "Hello World!";
    }

    @GetMapping(value="/{uuid}")

    public String helloGradle (@PathVariable(name="uuid") String user) {
        return "Hello " + user + " !";
    }
}
