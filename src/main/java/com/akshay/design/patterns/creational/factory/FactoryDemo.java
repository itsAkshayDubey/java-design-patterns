//Creational DP
package com.akshay.design.patterns.creational.factory;


public class FactoryDemo {

	public static void main(String[] args) {
		OSFactory osf = new OSFactory();
		OS obj = osf.getInstance("close");
		obj.spec();

	}

}
