//Structural DP
package com.akshay.design.patterns.structural.decorator;

public class DecoratorDemo {

	public static void main(String[] args) {
		
		System.out.println("Normal Circle");
		new Circle().draw();
		
		System.out.println();
		System.out.println("Red Cirle");
		new RedShapeDecorator(new Circle()).draw();
		
		System.out.println();
		System.out.println("Normal Circle");
		new Rectangle().draw();
		
		System.out.println();
		System.out.println("Red rectangle");
		new RedShapeDecorator(new Rectangle()).draw();

	}

}
