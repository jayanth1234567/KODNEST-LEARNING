package com.learn.Spring.SpringProject4;

public class Employee {
	int empid;
	String name;
	int empsalary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid, String name, int empsalary) {
		super();
		this.empid = empid;
		this.name = name;
		this.empsalary = empsalary;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(int empsalary) {
		this.empsalary = empsalary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", empsalary=" + empsalary + "]";
	}
	
}
