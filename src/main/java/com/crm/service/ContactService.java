package com.crm.service;


import java.util.List;

import com.crm.entities.Contact;
import com.crm.entities.Lead;


public interface ContactService {

	public void saveContact(Contact contact);

	public List<Contact> findAllContacts();

	public Contact getIdForBilling(long id);

	

	

	


	

	
	
	

}
