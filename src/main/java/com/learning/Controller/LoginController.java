package com.learning.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.learning.DTO.userDTO;
@Controller
public class LoginController {
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
