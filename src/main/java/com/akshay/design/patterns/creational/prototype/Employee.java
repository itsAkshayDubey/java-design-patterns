package com.akshay.design.patterns.creational.prototype;

public class Employee implements Prototype {
	
	private int id;
	private String name;
	private String designation;
	private double salary;
	private String address;
	
	public Employee() {
		System.out.println(this.toString());
	}

	public Employee(int id, String name, String designation, double salary, String address) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary
				+ ", address=" + address + "]";
	}

	
	public void showRecords() {
		System.out.println(this.toString());
	}
	
	public Prototype getClone() {
		return new Employee(this.id,this.name,this.designation,this.salary,this.address);
	}

}
