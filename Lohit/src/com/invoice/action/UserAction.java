package com.invoice.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.invoice.model.InvoiceHeader;
import com.invoice.model.InvoiceLocation;
import com.invoice.model.LoginUser;
import com.invoice.service.UserService;
import com.opensymphony.xwork2.ActionSupport;


public class UserAction extends ActionSupport{

	private static final long serialVersionUID = 1L;

	private InvoiceHeader invoiceHeader;
	private List<InvoiceLocation> invoiceLocationList;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	private UserService userService;

	private List<InvoiceHeader> users;

	// add user code

	public String addUser(){

		invoiceHeader = getInvoiceHeader();

		invoiceHeader.setCreatedOn(new java.util.Date()); // for current date to store on createdOn field.
		invoiceLocationList = invoiceHeader.getInvoiceLocation();

		for (InvoiceLocation location : invoiceLocationList) {
			location.getSno();
			location.getLocationid();
			location.getLocationArea();
			location.getLocationCity();
			location.getState();
			location.getCountry();

			location.setInvoiceHeader(invoiceHeader);
		}

		userService.saveUser(invoiceHeader);
		users = userService.getUserList();
		return "addUser";
	}

	// generate setters and getters 

	public InvoiceHeader getInvoiceHeader() {
		return invoiceHeader;
	}

	public void setInvoiceHeader(InvoiceHeader invoiceHeader) {
		this.invoiceHeader = invoiceHeader;
	}

	public List<InvoiceLocation> getInvoiceLocationList() {
		return invoiceLocationList;
	}

	public void setInvoiceLocationList(List<InvoiceLocation> invoiceLocationList) {
		this.invoiceLocationList = invoiceLocationList;
	}

	// list user code

	public String listUser(){
		users = userService.getUserList();
		return "users";
	}

	public String user() { 
		return "user"; 
	}

	public List<InvoiceHeader> getUsers() {
		return users;
	}

	public void setUsers(List<InvoiceHeader> users) {
		this.users = users;
	}

	// login details code

	private LoginUser loginuser;

	public String login()
	{
		//System.out.println(loginuser.getName());
		//System.out.println(loginuser.getPassword());

		if(userService.find(loginuser.getName(),loginuser.getPassword()))
		{
			users = userService.getUserList();
			return "user";
		}
		else
			addActionError("Invalid username and password");
		return ERROR;
	}

	public LoginUser getLoginuser() {
		return loginuser;
	}

	public void setLoginuser(LoginUser loginuser) {
		this.loginuser = loginuser;
	}
}