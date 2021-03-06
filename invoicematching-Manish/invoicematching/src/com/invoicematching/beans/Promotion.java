package com.invoicematching.beans;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.opensymphony.xwork2.ActionSupport;

@Entity
@Table(name="Promotion")
public class Promotion extends ActionSupport{
	@Column()
	private int promotionId;
	private String promotionName;
	private int itemId;
	private String itemName;
	private Date promotionStartDt;
	private Date promotionEndDt;
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
	public Date getPromotionStartDt() {
		return promotionStartDt;
	}
	public void setPromotionStartDt(Date promotionStartDt) {
		this.promotionStartDt = promotionStartDt;
	}
	public Date getPromotionEndDt() {
		return promotionEndDt;
	}
	public void setPromotionEndDt(Date promotionEndDt) {
		this.promotionEndDt = promotionEndDt;
	}
	public List getPromotionDetails() {
		return promotionDetails;
	}
	public void setPromotionDetails(List promotionDetails) {
		this.promotionDetails = promotionDetails;
	}
	public String execute(){
		
		return "success";	
	}
	

}
