package com.demo.ass.Models;

public class Employee {

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int id, String name, String gender, double salary) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
	}
	
	private int id;
	private String name;
	private String gender;
	private double salary;
	
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

}
