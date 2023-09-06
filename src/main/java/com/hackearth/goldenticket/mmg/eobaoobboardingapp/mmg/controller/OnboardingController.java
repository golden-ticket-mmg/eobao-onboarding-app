package com.hackearth.goldenticket.mmg.eobaoobboardingapp.mmg.controller;

import com.hackearth.goldenticket.mmg.eobaoobboardingapp.mmg.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/onboarding")
public class OnboardingController {
	
	@GetMapping("/index")
	public String toHomePage(Model model) {
		model.addAttribute("user", new User());
		return "index";
	}

	@PostMapping("/welcome")
	public String toWelcomeUpload(@ModelAttribute User user) {
		log.info(user.getEmail() + ":" + user.getPwd());
		return "welcome";
	}
	
	@GetMapping("/documentUpload")
	public String toDocumentUpload() {
		return "documentUpload";
	}
	

	@GetMapping("/getStarted")
	public String toGetStarted() {
		return "getStarted";
	}

	@GetMapping("/yourBusiness")
	public String toYourBusiness() {
		return "yourBusiness";
	}
	
	@GetMapping("/yourAccount")
	public String toYourAccount() {
		return "yourAccount";
	}
}