package com.struts2.beans;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


public class CopyOfUser extends ActionSupport implements ModelDriven<CopyOfUser> {
	private String uname;
	private String pwd;
	CopyOfUser user = new CopyOfUser();
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
	@Override
	public void validate(){
		 if(uname == null || uname.equals("")){
			 addFieldError("uname", "username is required!!!");
		 }
		 if(pwd == null || pwd.equals("")){
			 addFieldError("pwd", "password is required!!!");
		 }
	}
	@Override
	public CopyOfUser getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	public String execute(){
		if(getUname().equals("user") && getPwd().equals("pwd"))
			return "success";
		return "failure";
	}
	

}
