package com.learning.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping(value = "/")
	public String index() {
		return "index";
	}

	@GetMapping(value = "/contact")
	public String contact() {
		return "contact";
	}
	@GetMapping(value = "/notice")
	public String notice() {
		return "notice";
	}
	
	@GetMapping(value = "/login")
	public String login() {
		return "login";
	}
	
}