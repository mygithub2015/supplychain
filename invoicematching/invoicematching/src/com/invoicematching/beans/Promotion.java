package com.invoicematching.beans;

import java.util.Date;
import java.util.List;


import com.invoicematching.service.Service;
import com.opensymphony.xwork2.ActionSupport;


public class Promotion extends ActionSupport{
	private int promotionId;
	private String promotionName;
	private int itemId;
	private String itemName;
	private String promotionStartDt;
	private String promotionEndDt;
	private List<PromotionDetails> promotionDetails;
	public int getPromotionId() {
		return promotionId;
	}
	public void setPromotionId(int promotionId) {
		this.promotionId = promotionId;
	}
	public String getPromotionName() {
		return promotionName;
	}
	public void setPromotionName(String promotionName) {
		this.promotionName = promotionName;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getPromotionStartDt() {
		return promotionStartDt;
	}
	public void setPromotionStartDt(String promotionStartDt) {
		this.promotionStartDt = promotionStartDt;
	}
	public String getPromotionEndDt() {
		return promotionEndDt;
	}
	public void setPromotionEndDt(String promotionEndDt) {
		this.promotionEndDt = promotionEndDt;
	}
	public List<PromotionDetails> getPromotionDetails() {
		return promotionDetails;
	}
	public void setPromotionDetails(List<PromotionDetails> promotionDetails) {
		this.promotionDetails = promotionDetails;
	}
	public String execute(){
		System.out.println("Promotion Details...");
		System.out.println("Promotion Name: "+this.getPromotionName());
		System.out.println("Item Name: "+this.getItemName());
		System.out.println("Promotion Start Date: "+this.getPromotionStartDt());
		System.out.println("Promotion End Date:"+this.getPromotionEndDt());
		System.out.println("Promotion Location Details: "+getPromotionDetails());
		//new Service().service(this);
		return "success";	
	}
	

}
