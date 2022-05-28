package com.crm.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.entities.Contact;
import com.crm.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository contactrepo;

	@Override
	public void saveContact(Contact contact) {
		contactrepo.save(contact);
		
	}

	@Override
	public List<Contact> findAllContacts() {
		List<Contact> findAll = contactrepo.findAll();
		return findAll;
	}

	@Override
	public Contact getIdForBilling(long id) {
		Optional<Contact> findById = contactrepo.findById(id);
		Contact contact = findById.get();
		return contact;
	}

	

	

	

	
	
}
