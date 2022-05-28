package com.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crm.entities.Contact;
import com.crm.entities.Lead;
import com.crm.service.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	LeadService leadservice;

	@RequestMapping("/viewlead")
	public String viewLead() {
		return "view_lead";
	}
	
	@RequestMapping("/savelead")
	public String saveLead(Lead lead,ModelMap model) {
		try {
			leadservice.saveLead(lead);
			model.addAttribute("lead", lead);
			return "lead_info";
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("error","Email/mobile details already exist.");
			return "view_lead";
		}
	}
	
	@RequestMapping("/showdata")
	public String showData(ModelMap model) {
		List<Lead> lead = leadservice.getAllLeads();
		model.addAttribute("lead", lead);
		return "show_lead";
	}
	
	@RequestMapping("/getLeadById")
	public String getLeadById(@RequestParam("id") long id,ModelMap model) {
		Lead leadById = leadservice.getLeadById(id);
		model.addAttribute("lead", leadById);
		return "lead_info";
	}
}
	

