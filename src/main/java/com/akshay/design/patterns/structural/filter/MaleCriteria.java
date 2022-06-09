package com.akshay.design.patterns.structural.filter;

import java.util.ArrayList;
import java.util.List;

public class MaleCriteria implements Criteria{
	
	List<Person> malePersons = new ArrayList<Person>();

	public List<Person> meetCriteria(List<Person> persons) {
		for(Person person: persons) {
			if(person.getGender().equalsIgnoreCase("male")) {
				malePersons.add(person);
			}
		}
		
		return malePersons;
	}
}
