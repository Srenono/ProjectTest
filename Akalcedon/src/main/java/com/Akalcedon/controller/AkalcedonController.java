package com.Akalcedon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AkalcedonController {
	
	
	@GetMapping("/test")
	public String index() {
		return "test";
	}

}
 