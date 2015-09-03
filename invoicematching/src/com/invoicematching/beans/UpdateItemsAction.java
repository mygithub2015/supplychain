package com.invoicematching.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.invoicematching.dao.PromotionDaoImpl;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UpdateItemsAction extends ActionSupport implements ModelDriven<Items>{
	private Items items = new Items();
	@Override
	public Items getModel() {
		// TODO Auto-generated method stub
		System.out.println("UpdateItemAction->getModel");
		return items;
	}
	public String execute(){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		PromotionDaoImpl promoDaoImpl = (PromotionDaoImpl) context.getBean("promotionDao");
		System.out.println(items);
		promoDaoImpl.update(items);
		addActionMessage("1 row updated");
		return "success";
	}

}
