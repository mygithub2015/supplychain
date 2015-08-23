package com.invoice.dao;

import java.util.List;

import com.invoice.model.InvoiceHeader;

public interface UserDao 
{
	void saveUser(InvoiceHeader invoiceHeader);
	
	List<InvoiceHeader> getUserList(); 
	
	boolean find(String name, String password);
}
