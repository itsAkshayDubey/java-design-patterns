package com.akshay.design.patterns.behavioral.template;

public class Laptop extends ComputerTemplate{


	public void installOS() {

		System.out.println("Installing windows on laptop...");

	}

	public void assembleComponents() {
		
		System.out.println("Assembling components on laptop...");

	}
}
