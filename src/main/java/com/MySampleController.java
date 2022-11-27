package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MySampleController {

	@GetMapping(value = "/")
	public String greeting() {
		return "Welcome to Spring boot with AWS created by Akash Kale! I am Java Full Trainer";
	}
	
	@GetMapping(value = "say/{name}")
	public String sayHello(@PathVariable("name") String name) {
		return "Welcome to Spring boot with AWS by user "+name;
	}
}
