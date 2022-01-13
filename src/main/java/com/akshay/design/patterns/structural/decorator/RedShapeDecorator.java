package com.akshay.design.patterns.structural.decorator;

public class RedShapeDecorator extends ShapeDecorator{

	RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}
	
	public void draw() {
		decoratedShape.draw();
		setRedBorder(decoratedShape);
	}
	
	private void setRedBorder(Shape decoratedShape) {
		System.out.println("Setting border to red...");
	}
	

}
