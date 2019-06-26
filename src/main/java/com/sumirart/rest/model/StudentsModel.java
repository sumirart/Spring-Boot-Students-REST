package com.sumirart.rest.model;

public class StudentsModel {
	
	private long id;
	private String name;
	private Integer age;
	private String address;
	private String school;
	
//	id
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public void setModel(long id, String name, Integer age, String address, String school) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.school = school;
	}
	
//	name
	public String getName() {
		return name;
	}
	
//	age
	public Integer getAge() {
		return age;
	}
	
//	address
	public String getAddress() {
		return address;
	}
	
//	school
	public String getSchool() {
		return school;
	}
}
