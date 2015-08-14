package com.invoicematching.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Invoice_Details")
public class InvoiceDetail {
	@Id @GeneratedValue
	@Column(name="item_no")
	private int itemNo;

	@ManyToOne  //(cascade = {CascadeType.ALL})
	@JoinColumn(name="invoice_id")
	private Invoice invoice;

	@Column(name="item_desc")
	private String itemDesc;

	@Column(name="item_qty")
	private int qty;

	private double rate;

	@Column(name="total_price")
	private double totalPrice;

	public Invoice getInvoice() {
		return invoice;
	}
	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	public double getTotalPrice() {
		return qty*rate;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getItemNo() {
		return itemNo;
	}
	public void setItemNo(int itemNo) {
		this.itemNo = itemNo;
	}
	public String getItemDesc() {
		return itemDesc;
	}
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
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
		return "InvoiceDetail [itemNo=" + itemNo + ", invoice=" + invoice
				+ ", itemDesc=" + itemDesc + ", qty=" + qty + ", rate=" + rate
				+ ", totalPrice=" + totalPrice + "]";
	}

	

}
