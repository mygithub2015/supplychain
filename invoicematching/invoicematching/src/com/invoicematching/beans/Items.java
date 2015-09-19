package com.invoicematching.beans;

public class Items {
	private int itemId;
	private String itemName;
	private String itemClass;
	private String itemSubClass;
	private int qty;
	private double rate;
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
	public String getItemClass() {
		return itemClass;
	}
	public void setItemClass(String itemClass) {
		this.itemClass = itemClass;
	}
	public String getItemSubClass() {
		return itemSubClass;
	}
	public void setItemSubClass(String itemSubClass) {
		this.itemSubClass = itemSubClass;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "Items [itemId=" + itemId + ", itemName=" + itemName
				+ ", itemClass=" + itemClass + ", itemSubClass=" + itemSubClass
				+ ", qty=" + qty + ", rate=" + rate + "]";
	}
	

	

}
