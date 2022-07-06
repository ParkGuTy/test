package com.learning.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.learning.DTO.userDTO;

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
	@PostMapping(value = "/login")
	public String login(HttpServletRequest request) {
		userDTO dto = new userDTO();
		System.out.println(request.getParameter("id") + request.getParameter("pw"));
		dto.setU_id(request.getParameter("id"));
		dto.setU_pw(request.getParameter("pw"));
		return "";
	}
	
	@GetMapping(value = "/login")
	public String login() {
		return "login";
	}
	
}