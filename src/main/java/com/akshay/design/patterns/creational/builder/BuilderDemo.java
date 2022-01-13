//Creational DP
package com.akshay.design.patterns.creational.builder;


public class BuilderDemo {

	public static void main(String[] args) {
		
		
		Phone p = new PhoneBuilder().setOs("Android").setBattery(3000).getPhone();
		System.out.println(p);

	}

}
