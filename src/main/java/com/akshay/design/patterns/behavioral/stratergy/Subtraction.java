package com.akshay.design.patterns.behavioral.stratergy;

public class Subtraction implements Stratergy{

	public int doOperation(int a, int b) {
		return Math.abs(a-b);
	}

}
