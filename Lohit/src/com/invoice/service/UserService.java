package com.invoice.service;

import java.util.List;

import com.invoice.model.InvoiceHeader;


public interface UserService 
{
	void saveUser(InvoiceHeader invoiceHeader);
	
	List<InvoiceHeader> getUserList(); 
	
    boolean find(String name, String password);
}
