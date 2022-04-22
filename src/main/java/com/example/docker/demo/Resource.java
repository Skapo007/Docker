package com.example.docker.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/basic")
public class Resource {
	
	@GetMapping
	public String hello() {
		return "hello world";
	}

}
