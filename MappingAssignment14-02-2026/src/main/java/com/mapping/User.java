package com.mapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class User {
	@Id
private int id;
private String name;
private String email;

@OneToOne
private Profile profile;
public Profile getProfile() {
	return profile;
}
public void setProfile(Profile profile) {
	this.profile = profile;
}

@OneToMany
private List<PurchaseOrder> list;
public List<PurchaseOrder> getList() {
	return list;
}
public void setList(List<PurchaseOrder> list) {
	this.list = list;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", email=" + email + "]";
}


}
