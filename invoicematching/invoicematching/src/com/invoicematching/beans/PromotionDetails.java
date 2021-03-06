package com.invoicematching.beans;

public class PromotionDetails {
	
	private int id;
	private int locnId;
	private String locnAddr;
	private String city;
	private String state;
	private long price;
	public int getPromotionId() {
		return id;
	}
	public void setPromotionId(int id) {
		this.id = id;
	}
	public int getLocnId() {
		return locnId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setLocnId(int locnId) {
		this.locnId = locnId;
	}
	public String getLocnAddr() {
		return locnAddr;
	}
	public void setLocnAddr(String locnAddr) {
		this.locnAddr = locnAddr;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "PromotionDetails [id=" + id + ", locnId="
				+ locnId + ", locnAddr=" + locnAddr + ", city=" + city
				+ ", state=" + state + ", price=" + price + "]";
	}
	
	
}
