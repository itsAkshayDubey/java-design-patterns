package com.akshay.design.patterns.structural.filter;

import java.util.ArrayList;
import java.util.List;

public class MarriedCriteria implements Criteria {
	
	List<Person> marriedPersons = new ArrayList<Person>();

	public List<Person> meetCriteria(List<Person> persons) {
		for(Person person: persons) {
			if(person.getMaritalStatus().equalsIgnoreCase("married")) {
				marriedPersons.add(person);
			}
		}
		
		return marriedPersons;
	}

}
