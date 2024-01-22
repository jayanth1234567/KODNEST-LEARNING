package com.learn.Spring.SpringProject3;

import java.util.*;

public class Employee {
	
	List<String> technology;
	Set<String> projects;
	Map<String,String> companes;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(List<String> technology, Set<String> projects, Map<String, String> companes) {
		super();
		this.technology = technology;
		this.projects = projects;
		this.companes = companes;
	}
	public List<String> getTechnology() {
		return technology;
	}
	public void setTechnology(List<String> technology) {
		this.technology = technology;
	}
	public Set<String> getProjects() {
		return projects;
	}
	public void setProjects(Set<String> projects) {
		this.projects = projects;
	}
	public Map<String, String> getCompanes() {
		return companes;
	}
	public void setCompanes(Map<String, String> companes) {
		this.companes = companes;
	}
	@Override
	public String toString() {
		return "Employee [technology=" + technology + ", projects=" + projects + ", companes=" + companes + "]";
	}
	
	
	

}
