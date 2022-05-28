package com.crm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.entities.Lead;
import com.crm.repository.LeadRepository;
@Service
public class LeadServiceImpl implements LeadService {

	@Autowired
	LeadRepository leadrepo;

	@Override
	public void saveLead(Lead lead) {
		leadrepo.save(lead);
	}

	@Override
	public List<Lead> getAllLeads() {
		List<Lead> lead = leadrepo.findAll();
		return lead;
	}

	@Override
	public Lead getLeadById(long id) {
		Optional<Lead> findById = leadrepo.findById(id);
		Lead lead = findById.get();
		return lead;
	}

	@Override
	public void deleteLeadById(long id) {
		leadrepo.deleteById(id);
		
	}
	
}
