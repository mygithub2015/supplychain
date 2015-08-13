package com.struts2.beans;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;


public class User extends ActionSupport{
	
	private String uname;
	private String pwd;
	List<Address> addrList;
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public List<Address> getAddrList() {
		return addrList;
	}
	public void setAddrList(List<Address> addrList) {
		this.addrList = addrList;
	}
	@Override
	public void validate(){
		 if(uname == null || uname.equals("")){
//			 addFieldError("uname", "username is required!!!");
			 addFieldError("uname", getText("username.required"));
		 }
		 if(pwd == null || pwd.equals("")){
			// addFieldError("pwd", "password is required!!!");
			 addFieldError("pwd",getText("password.required"));
		 }
	}
	
	public String execute(){
		if(getUname().equals("user") && getPwd().equals("pwd")){
			System.out.println("valid user");
			System.out.println("List of Addresses...");
			for(Address addr : getAddrList()){
				System.out.println("StreetName: "+addr.getStreetName()+", city: "+addr.getCity()+", state: " +
						""+addr.getState()+"-"+addr.getPin());
			}
			return "success";
		}
		System.out.println("invalid user");
		return "failure";
	}

	

}
