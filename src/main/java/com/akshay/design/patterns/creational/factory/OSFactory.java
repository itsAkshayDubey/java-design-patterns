package com.akshay.design.patterns.creational.factory;

public class OSFactory {
	
	public OS getInstance(String OS) {
		if(OS.equalsIgnoreCase("Open"))
			return new Android();
		else
			return new IOS();
	}

}
