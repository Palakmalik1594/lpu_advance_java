package com.onetomanymapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Colleges {
	@Id
	private int id;
	private String name;
	private String location;
	private String pincode;
	@OneToMany(fetch=FetchType.EAGER)
	private List<Students>student;
	
	public List<Students> getS() {
		return student;
	}
	public void setS(List<Students> student) {
		this.student = student;
	}
	//one to many and many to many are lazy
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "College [id=" + id + ", name=" + name + ", location=" + location + ", pincode=" + pincode + "]";
	}

}
