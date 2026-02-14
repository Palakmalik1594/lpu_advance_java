package com.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Profile {
	@Id
	private int id;
	private String phone;
	
	
	@Override
	public String toString() {
		return "Profile [id=" + id + ", phone=" + phone + ", address=" + address + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	private String address;

}
