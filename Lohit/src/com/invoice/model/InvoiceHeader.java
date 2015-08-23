package com.invoice.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="invoice_header")
public class InvoiceHeader implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="invoice_id")
	private String invoiceid;

	@Column(name="invoice_name")
	private String invoicename;

	@Column(name="quantity")
	private String quantity;

	@Column(name="amount")
	private String amount;

	@Temporal(TemporalType.DATE)
	@Column (name="createdOn")
	private Date createdOn;

	// One to Many mapping using List
	@OneToMany(mappedBy="invoiceHeader", cascade = CascadeType.ALL)
	private List<InvoiceLocation> invoiceLocation;

	// generate setters and getters

	public String getInvoiceid() {
		return invoiceid;
	}
	public void setInvoiceid(String invoiceid) {
		this.invoiceid = invoiceid;
	}
	public String getInvoicename() {
		return invoicename;
	}
	public void setInvoicename(String invoicename) {
		this.invoicename = invoicename;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public List<InvoiceLocation> getInvoiceLocation() {
		return invoiceLocation;
	}
	public void setInvoiceLocation(List<InvoiceLocation> invoiceLocation) {
		this.invoiceLocation = invoiceLocation;
	}

}