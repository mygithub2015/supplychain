package com.invoicematching.beans;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.invoicematching.dao.InvoiceDao;

@Entity
@Table(name="user")
public class User {
	private int userId;
	private String uname;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	
	public String execute(){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		User user = new User();
		HibernateTemplate template = context.getBean("template",org.springframework.orm.hibernate3.HibernateTemplate.class);
		InvoiceDao dao = new InvoiceDao();
		dao.setTemplate(template);
		dao.save(user);
		System.out.println("user is saved");
		return "success";
	}

}
