package com.example.compare;

import java.util.Comparator;

public class PersonHelper implements Comparator<Person>{

	public int compare(Person person1, Person person2) {
		Integer lastNameComparision = person1.getLastName().compareTo(person2.getLastName());
		if (lastNameComparision != 0) {
			return lastNameComparision;
		}
		
		return person1.getFirstName().compareTo(person2.getFirstName());
	}

}
