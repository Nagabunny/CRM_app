package com.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crm.entities.Contact;
import com.crm.entities.Lead;
import com.crm.service.ContactService;
import com.crm.service.LeadService;

@Controller
public class ContactController {
	@Autowired
	private LeadService leadservice;
	@Autowired
	private ContactService contactservice;
	
	@RequestMapping("/convertToContact")
	public String convertToContact(@RequestParam("id") long id,ModelMap model) {
		Lead lead = leadservice.getLeadById(id);
		
		Contact contact= new Contact();
		contact.setEmail(lead.getEmail());
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setLeadSource(lead.getLeadSource());
		contact.setMobile(lead.getMobile());
		
		contactservice.saveContact(contact);
		leadservice.deleteLeadById(id);
		
		model.addAttribute("msg", "moved to contact successfully!");
		return "show_lead";
	}
	
	@RequestMapping("/showcontact")
	public String getAllContacts(ModelMap model) {
		List<Contact> contact = contactservice.findAllContacts();
		model.addAttribute("contact", contact);
		return "show_contact";
	}
	
	
	@RequestMapping("/getIdForBilling")
	public String getIdForBilling(@RequestParam("id") long id, ModelMap model) {
		Contact contact= contactservice.getIdForBilling(id);
		model.addAttribute("contact", contact);
		return "billing_info";
	}
	
}
