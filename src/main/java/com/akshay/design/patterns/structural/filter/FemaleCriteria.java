package com.akshay.design.patterns.structural.filter;

import java.util.ArrayList;
import java.util.List;

public class FemaleCriteria implements Criteria {
	
	List<Person> femalePersons = new ArrayList<Person>();

	public List<Person> meetCriteria(List<Person> persons) {
		for(Person person: persons) {
			if(person.getGender().equalsIgnoreCase("female")) {
				femalePersons.add(person);
			}
		}
		
		return femalePersons;
	}

}
