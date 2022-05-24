package com.akshay.design.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private int id;
	private String name;
	private String dept;
	private int salary;
	private List<Employee> subordinates;

	public Employee(int id,String name,String dept, int sal) {
		this.id=id;
		this.name = name;
		this.dept = dept;
		this.salary = sal;
		subordinates = new ArrayList<Employee>();
	}

	public void addSubordinate(Employee e) {
		subordinates.add(e);
	}

	public void removeSubOrdinate(Employee e) {
		subordinates.remove(e);
	}

	public List<Employee> getSubordinates(){
		return subordinates;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + ", subordinates="
				+ subordinates + "]";
	}



}
