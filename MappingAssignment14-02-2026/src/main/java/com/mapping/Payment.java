package com.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Payment {
	@Id
	private int id;
	private String mode;
	private int amount;
	
	
	@ManyToOne
	private PurchaseOrder purchaseorder;
	public PurchaseOrder getPurchaseorder() {
		return purchaseorder;
	}
	public void setPurchaseorder(PurchaseOrder purchaseorder) {
		this.purchaseorder = purchaseorder;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Payment [id=" + id + ", mode=" + mode + ", amount=" + amount + "]";
	}
	

}
