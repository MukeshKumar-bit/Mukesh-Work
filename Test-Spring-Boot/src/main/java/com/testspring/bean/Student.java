package com.testspring.bean;

public class Student {
	int id;
	String Name;
	String lastName;
	public Student(int id, String name, String lastName) {
		super();
		this.id = id;
		Name = name;
		this.lastName = lastName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

}
