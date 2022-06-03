package com.akshay.design.patterns.creational.singleton;

public class SingletonClass {
	
	static SingletonClass obj = new SingletonClass();//Step 1 create static object
	private SingletonClass() {}//Step 2 make constructor as private
	
	//Step 3 write a method which will return the static object
	//that we created in step1
	public static SingletonClass getInstance() {
		return obj;
	}

}
