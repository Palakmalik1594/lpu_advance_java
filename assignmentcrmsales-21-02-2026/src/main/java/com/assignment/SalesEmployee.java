package com.assignment;

public class SalesEmployee {
private Long empId;
private String name;
private String department;
public Long getEmpId() {
	return empId;
}
@Override
public String toString() {
	return "SalesEmployee [empId=" + empId + ", name=" + name + ", department=" + department + "]";
}
public void setEmpId(Long empId) {
	this.empId = empId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
}
