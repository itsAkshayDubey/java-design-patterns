//Behavioral DP
package com.akshay.design.patterns.behavioral.template;

public class TemplateDemo {

	public static void main(String[] args) {
		
		
		ComputerTemplate laptop = new Laptop();
		laptop.buildComputer();
		
		ComputerTemplate server = new Server();
		server.buildComputer();

	}

}
