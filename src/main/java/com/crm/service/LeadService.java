package com.crm.service;


import java.util.List;

import com.crm.entities.Contact;
import com.crm.entities.Lead;


public interface LeadService {

	public void saveLead(Lead lead);

	public List<Lead> getAllLeads();

	public Lead getLeadById(long id);

	public void deleteLeadById(long id);
	
	

}
