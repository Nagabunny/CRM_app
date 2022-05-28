package com.crm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crm.utilities.EmailService;

@Controller
public class LeadEmailController {
	
	@Autowired
	EmailService emailservice;

	@RequestMapping("/sendemail")
	public String sendEmail(@RequestParam("email") String email,ModelMap model) {
		model.addAttribute("to", email);
		return "send_email";
	}
	
	@RequestMapping("/send")
	public String sendSender(@RequestParam("to") String to, @RequestParam("sub") String sub,@RequestParam("message") String message, ModelMap model) {
		emailservice.sendSimpleMessage(to, sub, message);
		model.addAttribute("msg", "email sent!");
		return "send_email";
	}
	
	}
