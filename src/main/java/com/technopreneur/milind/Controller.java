package com.technopreneur.milind;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {
	
	@GetMapping("/message")
	public String getMessage() {
		return "Welcome to world of Dockers!!";
	}

}
