//Structural DP
package com.akshay.design.patterns.structural.composite;

public class CompositeDemo {

	public static void main(String[] args) {

		Employee CEO = new Employee(1,"John","CEO", 30000);

		Employee headSales = new Employee(2,"Robert","Head Sales", 20000);

		Employee headMarketing = new Employee(3,"Michel","Head Marketing", 20000);

		Employee clerk1 = new Employee(4,"Laura","Marketing", 10000);
		Employee clerk2 = new Employee(5,"Bob","Marketing", 10000);

		Employee salesExecutive1 = new Employee(6,"Richard","Sales", 10000);
		Employee salesExecutive2 = new Employee(7,"Rob","Sales", 10000);

		CEO.addSubordinate(headSales);
		CEO.addSubordinate(headMarketing);

		headSales.addSubordinate(salesExecutive1);
		headSales.addSubordinate(salesExecutive2);

		headMarketing.addSubordinate(clerk1);
		headMarketing.addSubordinate(clerk2);

		System.out.println(CEO); 

		for (Employee headEmployee : CEO.getSubordinates()) {
			System.out.println(headEmployee);

			for (Employee employee : headEmployee.getSubordinates()) {
				System.out.println(employee);
			}
		}		
	}

}
