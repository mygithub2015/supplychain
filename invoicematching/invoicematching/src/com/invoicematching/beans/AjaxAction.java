package com.invoicematching.beans;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.invoicematching.dao.Dao;
import com.invoicematching.dao.PromotionDaoImpl;
import com.opensymphony.xwork2.ActionSupport;

public class AjaxAction extends ActionSupport{
	Logger logger = Logger.getLogger(AjaxAction.class);
	private List<Integer> itemList = new ArrayList<Integer>();
	private int itemId;
	public List<Integer> getItemList() {
		return itemList;
	}
	public void setItemList(List<Integer> itemList) {
		this.itemList = itemList;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String execute(){
		logger.info("AjaxAction:entering execute method started...");
		/*ValueStack stack = ActionContext.getContext().getValueStack();
		stack.set("flag", "yes");*/
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Dao dao = (PromotionDaoImpl) context.getBean("promotionDao");
		int itemId = this.itemId;
		System.out.println(itemId);
		System.out.println(dao.getIds(itemId));
		for(Integer id: dao.getIds(itemId)){
			itemList.add(id);
		}
		System.out.println(itemList);
		logger.info("AjaxAction:exiting execute method ended");
		return SUCCESS;
	}
}
