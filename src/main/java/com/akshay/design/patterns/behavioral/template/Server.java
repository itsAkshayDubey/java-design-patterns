package com.akshay.design.patterns.behavioral.template;

public class Server extends ComputerTemplate{


	public void installOS() {
		System.out.println("Installing ubuntu...");
	}

	public void assembleComponents() {
		System.out.println("Assembling server components...");
	}
}
