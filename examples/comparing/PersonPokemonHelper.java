package com.example.compare;

import java.util.Comparator;

public class PersonPokemonHelper implements Comparator<Object> {

	public int compare(Object obj1, Object obj2) throws IllegalArgumentException {
		String obj1ComparisionString = getComparisionString(obj1);
		String obj2ComparisionString = getComparisionString(obj2);
		
		return obj1ComparisionString.compareTo(obj2ComparisionString);
	}
	
	public String getComparisionString(Object obj) throws IllegalArgumentException{
		String comparisionString;
		
		try {			
			if (obj instanceof Pokemon) {
				comparisionString = ((Pokemon) obj).getName();
			} else {
				comparisionString = ((Person) obj).getLastName();
			}
		} catch (ClassCastException e) { 
			throw new IllegalArgumentException();
		}
		
		return comparisionString;
	}

}
