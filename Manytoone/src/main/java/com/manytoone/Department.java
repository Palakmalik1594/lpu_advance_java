package com.manytoone;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {
	@Id
	private int id;
	private String name;
	private String managername;
	private int count_emp;
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", managername=" + managername + ", count_emp=" + count_emp
				+ "]";
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
	public String getManagername() {
		return managername;
	}
	public void setManagername(String managername) {
		this.managername = managername;
	}
	public int getCount_emp() {
		return count_emp;
	}
	public void setCount_emp(int count_emp) {
		this.count_emp = count_emp;
	}

}
