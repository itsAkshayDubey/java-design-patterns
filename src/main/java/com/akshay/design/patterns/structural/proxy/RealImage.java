package com.akshay.design.patterns.structural.proxy;

public class RealImage implements Image {

	private String fileName;
	
	public RealImage() {}
	
	
	
	public RealImage(String fileName) {
		super();
		this.fileName = fileName;
		loadFromDisk(fileName);
	}



	public String getFileName() {
		return fileName;
	}



	public void setFileName(String fileName) {
		this.fileName = fileName;
	}


	public void display() {
		
		System.out.println("Displaying: "+fileName);
		
	}
	
	public void loadFromDisk(String fileName) {
		
		System.out.println("Loading: "+fileName);
		
	}

}
