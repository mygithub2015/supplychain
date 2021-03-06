package com.invoicematching.beans;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.invoicematching.service.Service;
import com.opensymphony.xwork2.ActionSupport;
@Entity
@Table(name="Invoice")
public class Invoice extends ActionSupport{
	@Id @GeneratedValue
	@Column(name="invoice_id")
	private String invoiceId;
	@Column(name="invoice_name")
	private String invoiceName;
	@Column(name="total_amt")
	double totalAmt;

	@OneToMany(mappedBy="invoice")
	private List<InvoiceDetail> invoiceDetail;

	public String getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}

	public String getInvoiceName() {
		return invoiceName;
	}
	public void setInvoiceName(String invoiceName) {
		this.invoiceName = invoiceName;
	}
	public List<InvoiceDetail> getInvoiceDetail() {
		return invoiceDetail;
	}
	public void setInvoiceDetail(List<InvoiceDetail> invoiceDetail) {
		this.invoiceDetail = invoiceDetail;
	}
	public double getTotalAmt() {
		return totalAmt;
	}
	public void setTotalAmt(double totalAmt) {
		this.totalAmt = totalAmt;
	}
	
@Override
	public String toString() {
		return "Invoice [invoiceId=" + invoiceId + ", invoiceName="
				+ invoiceName + ", totalAmt=" + totalAmt + ", invoiceDetail="
				+ invoiceDetail + "]";
	}
public String execute(){
	new Service().service(this);
	
	return "success";
}
}
