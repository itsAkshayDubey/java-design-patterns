//Behavioral DP
package com.akshay.design.patterns.behavioral.stratergy;

public class StratergyDemo {

	public static void main(String[] args) {
		
		System.out.println(new Context(new Addition()).executeStratergy(1, 2));
		
		System.out.println(new Context(new Subtraction()).executeStratergy(5, 1));
		
		System.out.println(new Context(new Multiplication()).executeStratergy(5, 3));
	}

}
