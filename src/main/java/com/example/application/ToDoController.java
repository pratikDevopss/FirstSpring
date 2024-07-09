package com.example.application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToDoController {

	@GetMapping("/welcome")
	public String display()
	{
		return "Hello world";
	}
	
	
	

}
