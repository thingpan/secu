package com.test.secu.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {
	@GetMapping("/")
	public String home() {
		return "index";
	}
	@GetMapping("/html/**")
	public void gopage() {
		
	}
}
