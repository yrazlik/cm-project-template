package com.obss.codemastersb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello-world")
@RestController
public class HelloWorldController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "hello";
	}
}
