package com.hackearth.goldenticket.mmg.eobaoobboardingapp.mmg.controller;

import com.hackearth.goldenticket.mmg.eobaoobboardingapp.data.GetStartedInfo;
import com.hackearth.goldenticket.mmg.eobaoobboardingapp.data.YourBusinessInfo;
import com.hackearth.goldenticket.mmg.eobaoobboardingapp.mmg.model.User;
import com.hackearth.goldenticket.mmg.eobaoobboardingapp.service.RestEntryPoint;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@Autowired
	private RestEntryPoint restEntryPoint;
	
	@GetMapping("/index")
	public String toHomePage(Model model) {
		model.addAttribute("user", new User());
		return "index";
	}

	@PostMapping("/welcome")
	public String toWelcomeUpload() {//@ModelAttribute User user) {
		//log.info(user.getEmail() + ":" + user.getPwd());
		return "welcome";
	}
	
	@GetMapping("/documentUpload")
	public String toDocumentUpload() {
		return "documentUpload";
	}
	

	@GetMapping("/getStarted")
	public String toGetStarted(Model model) {
		
		GetStartedInfo getStartedInfo = restEntryPoint.getGetStarted("1");
//		if (getStartedInfo != null) {
//			System.out.println("ARN=" + getStartedInfo.getArn() + getStartedInfo.getAddress());
//		} else {
//			System.out.println("ERROR!!!!!!!!!!!!!!!!!!!!!!!!");
//		}
		
		model.addAttribute("getStartedInfo", getStartedInfo);
		
		return "getStarted";
	}

	@GetMapping("/yourBusiness")
	public String toYourBusiness(Model model) {
		
		YourBusinessInfo yourBusinessInfo = restEntryPoint.getYourBusiness("1");

		
		model.addAttribute("yourBusinessInfo", yourBusinessInfo);
		
		return "yourBusiness";
	}
	
	@GetMapping("/submit")
	public String toSubmit() {
		return "submit";
	}
}