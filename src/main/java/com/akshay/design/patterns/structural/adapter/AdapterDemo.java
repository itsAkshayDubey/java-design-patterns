//Structural DP
package com.akshay.design.patterns.structural.adapter;

public class AdapterDemo {

	public static void main(String[] args) {

		Assignment ass = new Assignment();
		ass.setPen(new PenAdapter());

		ass.writeAssignment("Writing assignment...");

	}

}
