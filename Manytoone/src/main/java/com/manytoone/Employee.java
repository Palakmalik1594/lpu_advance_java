package com.manytoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //it assigns an id for entity,if id deleted then new id will be assigned to it
	//identity starts creating id from 1
	//in identity we cannot initialize the range but in sequence we can initialize
private int id;
private String name;
private int salary;
private String designation;
@ManyToOne
private Department department;


@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation + "]";
}
public int getId() {
	return id;
}
public Department getDepartment() {
	return department;
}
public void setDepartment(Department department) {
	this.department = department;
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
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
}
