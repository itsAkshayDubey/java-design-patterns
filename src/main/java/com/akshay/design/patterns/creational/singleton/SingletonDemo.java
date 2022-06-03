//Creational DP
package com.akshay.design.patterns.creational.singleton;

public class SingletonDemo {

	public static void main(String[] args) {
		
		SingletonClass a = SingletonClass.getInstance();
		SingletonClass b = SingletonClass.getInstance();//Both are same instances

	}

}
