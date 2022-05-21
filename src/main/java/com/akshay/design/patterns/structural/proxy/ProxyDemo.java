//Structural DP
package com.akshay.design.patterns.structural.proxy;

public class ProxyDemo {
	
	public static void main(String[] args) {
		
		Image image = new ProxyImage("IMG-2343.jpg");
		
		//for the first call image will be loaded from disk
		image.display();
		
		//for the second call image will be displayed w/o loading
		
		image.display();
		
	}

}
