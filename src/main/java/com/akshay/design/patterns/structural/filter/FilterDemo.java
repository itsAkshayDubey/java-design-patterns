//Structural DP
package com.akshay.design.patterns.structural.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterDemo {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();

		persons.add(new Person("Robert","Male", "Single"));
		persons.add(new Person("John", "Male", "Married"));
		persons.add(new Person("Laura", "Female", "Married"));
		persons.add(new Person("Diana", "Female", "Single"));
		persons.add(new Person("Mike", "Male", "Single"));
		persons.add(new Person("Bobby", "Male", "Single"));

		Criteria male = new MaleCriteria();
		Criteria female = new FemaleCriteria();
		Criteria married = new MarriedCriteria();
		Criteria marriedMale = new AndCriteria(married, male);
		Criteria marriedOrFemale = new OrCriteria(married, female);

		System.out.println("Males: ");
		printPersons(male.meetCriteria(persons));

		System.out.println("\nFemales: ");
		printPersons(female.meetCriteria(persons));

		System.out.println("\nMarried Males: ");
		printPersons(marriedMale.meetCriteria(persons));

		System.out.println("\nMarried Or Females: ");
		printPersons(marriedOrFemale.meetCriteria(persons));


	}

	public static void printPersons(List<Person> persons){

		for (Person person : persons) {
			System.out.println("Person : [ Name : " + person.getName() + ", Gender : " + person.getGender() + ", Marital Status : " + person.getMaritalStatus() + " ]");
		}
	} 

}
