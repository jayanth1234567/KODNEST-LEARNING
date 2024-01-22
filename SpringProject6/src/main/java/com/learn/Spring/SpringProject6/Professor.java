package com.learn.Spring.SpringProject6;

public class Professor {
	int pr_id;
	String pr_name;
	String Pr_subject;
	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Professor(int pr_id, String pr_name, String pr_subject) {
		super();
		this.pr_id = pr_id;
		this.pr_name = pr_name;
		Pr_subject = pr_subject;
	}
	public int getPr_id() {
		return pr_id;
	}
	public void setPr_id(int pr_id) {
		this.pr_id = pr_id;
	}
	public String getPr_name() {
		return pr_name;
	}
	public void setPr_name(String pr_name) {
		this.pr_name = pr_name;
	}
	public String getPr_subject() {
		return Pr_subject;
	}
	public void setPr_subject(String pr_subject) {
		Pr_subject = pr_subject;
	}
	@Override
	public String toString() {
		return "Professor [pr_id=" + pr_id + ", pr_name=" + pr_name + ", Pr_subject=" + Pr_subject + "]";
	}
	
}
