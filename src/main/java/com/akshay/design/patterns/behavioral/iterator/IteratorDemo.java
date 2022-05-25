//Behavioral DP
package com.akshay.design.patterns.behavioral.iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		
		NameRepository names = new NameRepository();
		
		for(Iterator it = names.getIterator() ; it.hasNext() ; ) {
			
			String name = (String) it.next();
			System.out.println("Name: "+name);
		}
		
	}
	
}
