package com.example.smartspring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class UtamaController {

	@RequestMapping("/")

	public String utama() {
		String home = "Utama";
		return home;
	}

	@RequestMapping("/login")

	public String login() {
		String home = "login";
		return home;
	}

	@RequestMapping("/login/action")

	public String datalogin(HttpServletRequest request, Model model) {

		String mintaUser = request.getParameter("username");
		String mintaPass = request.getParameter("password");
		model.addAttribute("userLempar", mintaUser);
		model.addAttribute("passLempar", mintaPass);

		String html = "Datalogin";
		return html;
	}

	
}
