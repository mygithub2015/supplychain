package com.invoicematching.beans;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.invoicematching.dao.Dao;
import com.invoicematching.dao.PromotionDaoImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;

public class SearchAction  extends ActionSupport implements ModelDriven<Items>{
	private Logger logger = Logger.getLogger(com.invoicematching.beans.SearchAction.class);
	private Items items = new Items();
	@Override
	public Items getModel() {
		// TODO Auto-generated method stub
		return items;
	}
	public String execute(){
		logger.info("SearchAction:entering execute method started...");
		/*ValueStack stack = ActionContext.getContext().getValueStack();
		stack.set("flag", "yes");*/
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Dao dao = (PromotionDaoImpl) context.getBean("promotionDao");
		int itemId = items.getItemId();
		System.out.println(itemId);
		System.out.println(dao.getIds(itemId));
		for(Integer id: dao.getIds(itemId)){
			addActionMessage(id.toString());
		}
		logger.info("SearchAction:exiting execute method ended");
		return SUCCESS;
	}
}
