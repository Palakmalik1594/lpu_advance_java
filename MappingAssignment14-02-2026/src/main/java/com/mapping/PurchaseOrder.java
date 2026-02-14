package com.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PurchaseOrder {
	@Id
	private int id;
	private String orderDate;
	private int totalamount;
	@Override
	public String toString() {
		return "PurchaseOrder [id=" + id + ", orderDate=" + orderDate + ", totalamount=" + totalamount + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public int getTotalamount() {
		return totalamount;
	}
	public void setTotalamount(int totalamount) {
		this.totalamount = totalamount;
	}
	

}
