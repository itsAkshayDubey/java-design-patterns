//Creational DP
package com.akshay.design.patterns.creational.prototype;

public class PrototypeDemo {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(1,"Dummy Name"," Dummy Designation",2000,"Dummy Address");
		
		e1.showRecords();
		
		Employee e2 = (Employee) e1.getClone();
		
		e2.showRecords();
		
	}

}
