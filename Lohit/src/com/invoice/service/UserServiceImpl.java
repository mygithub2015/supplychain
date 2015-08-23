package com.invoice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.invoice.dao.UserDao;
import com.invoice.model.InvoiceHeader;

//@Service("userService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true) 
public class UserServiceImpl implements UserService {

	private UserDao userDao;
	
	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)  
	public void saveUser(InvoiceHeader invoiceHeader) {
		userDao.saveUser(invoiceHeader);
	}

	@Override
	public List<InvoiceHeader> getUserList() {
		return userDao.getUserList();
	}

	public boolean find(String name, String password)
	{
		return userDao.find(name, password);
	}
	
	// generate setters and getters
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
}
