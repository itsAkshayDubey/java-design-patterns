//Creational DP
package com.akshay.design.patterns.creational.builder;


public class BuilderDemo {

	public static void main(String[] args) {
		
		System.out.println("Building phone object using known attributes...");
		Phone p = new PhoneBuilder().setOs("Android").setBattery(3000).getPhone();
		System.out.println(p);

	}

}
