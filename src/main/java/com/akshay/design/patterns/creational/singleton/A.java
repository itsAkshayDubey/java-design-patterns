package com.akshay.design.patterns.creational.singleton;

public class A {
	
	static A obj = new A();//Step 1 create static object
	private A() {}//Step 2 make constructor as private
	
	//Step 3 write a method which will return the static object
	//that we created in step1
	public static A getInstance() {
		return obj;
	}

}
