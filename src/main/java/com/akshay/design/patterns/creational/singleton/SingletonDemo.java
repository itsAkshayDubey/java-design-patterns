package com.akshay.design.patterns.creational.singleton;

public class SingletonDemo {

	public static void main(String[] args) {
		
		A a = A.getInstance();
		A b = A.getInstance();//Both are same instances

	}

}
