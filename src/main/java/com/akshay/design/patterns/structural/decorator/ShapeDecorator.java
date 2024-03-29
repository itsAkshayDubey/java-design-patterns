package com.akshay.design.patterns.structural.decorator;

public abstract class ShapeDecorator implements Shape{
	
	protected Shape decoratedShape;
	
	ShapeDecorator(Shape decoratedShape){
		this.decoratedShape = decoratedShape;
	}

	public void draw() {
		decoratedShape.draw();
		
	}

}
