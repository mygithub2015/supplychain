package com.invoicematching.beans;

import org.apache.log4j.Logger;

import com.invoicematching.dao.PromotionDaoImpl;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class FetchItemDetails extends ActionSupport implements ModelDriven<Items>{
	Items items = new Items();
	Logger logger = Logger.getLogger(FetchItemDetails.class);
	@Override
	public Items getModel() {
		// TODO Auto-generated method stub
		System.out.println("inside getModel");
		
		return items;
	}
	public String execute(){
		logger.info("fetchItemDetails -> execute starts here...");
		System.out.println("inside execute method");
		//int a = 5 / 0;
		
		System.out.println(items.getItemId());
		PromotionDaoImpl promoDaoImpl = new PromotionDaoImpl();
		Items itemsTemp = promoDaoImpl.getItemsById(items.getItemId());
		if(itemsTemp == null){
			addActionError("Item not found");
			return ERROR;
		}
		items.setItemName(itemsTemp.getItemName());
		items.setItemClass(itemsTemp.getItemClass());
		items.setItemSubClass(itemsTemp.getItemSubClass());
		items.setQty(itemsTemp.getQty());
		items.setRate(itemsTemp.getRate());
		System.out.println(items);
		addActionMessage("Items details are...");
		logger.info("fetchItemDetails -> execute ends here...");
		return SUCCESS;
	}

}
 