package com.akshay.design.patterns.behavioral.stratergy;

public class Context {
	private static Stratergy stratergy;
	Context(Stratergy stratergy){
		this.stratergy = stratergy;
	}
	
	public int executeStratergy(int a,int b) {
		return stratergy.doOperation(a, b);
	}

}
