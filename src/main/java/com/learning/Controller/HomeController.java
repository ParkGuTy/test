package com.learning.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping(value = "/")
	public String index() {
		return "index";
	}
	
	@GetMapping(value = "/404")
	public String error404() {
		return "404";
	}
	
	@GetMapping(value = "/contact")
	public String contact() {
		return "contact";
	}
	@GetMapping(value = "/practice")
	public String practice() {
		return "practice";
	}
	@GetMapping(value = "/practice2")
	public String practice2() {
		return "practice2";
	}
	@GetMapping(value = "/practice3")
	public String practice3() {
		return "practice3";
	}
}