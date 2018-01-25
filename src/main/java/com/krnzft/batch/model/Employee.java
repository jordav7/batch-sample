package com.krnzft.batch.model;

public class Employee {

	private String name;
	private String lastname;
	private Integer age;
	
	public Employee() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", lastname=" + lastname + ", age=" + age + "]";
	}
	
}
