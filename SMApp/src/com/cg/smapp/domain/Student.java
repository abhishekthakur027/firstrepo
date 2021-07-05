package com.cg.smapp.domain;

public class Student {

	private int rollno;
	private String name;
	private String subject;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", subject=" + subject + "]";
	}
	
	
}
