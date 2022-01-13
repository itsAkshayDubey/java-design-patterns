package com.akshay.design.patterns.behavioral.template;

public abstract class ComputerTemplate {
	
	public final void buildComputer() {
		collectComponents();
		assembleComponents();
		installOS();
		startComputer();
	}
	
	public void collectComponents() {
		
		System.out.println("Collectiong components..");
		
	}
	
	public void startComputer() {
		
		System.out.println("Starting computer....");
		
	}
	
	abstract public void installOS();
	
	abstract public void assembleComponents();

}
