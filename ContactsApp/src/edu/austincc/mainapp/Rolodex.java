package edu.austincc.mainapp;

import java.util.ArrayList;
import java.util.Date;
import java.util.TreeMap;

import edu.austincc.domain.Address;
import edu.austincc.domain.InvalideEmailAddressException;
import edu.austincc.domain.Person;
import edu.austincc.domain.State;

public class Rolodex {

	private TreeMap<String, Person> theCards = new TreeMap<String, Person>();
	private ArrayList<String> errors = new ArrayList<String>();

	public Rolodex() {
		super();
		
		Person demoPerson = demoPerson1();
		
		theCards.put(demoPerson.getLastName(), demoPerson);
		
		System.out.println("Done");
		
	}

	protected Person demoPerson1() {
		Person demoPerson = new Person("Sam", "Griffith", new Date(1997, 9, 19));
		Address demoPersonAddress = new Address("1 West St.", "", "Austin", State.TEXAS, "78759");
		demoPerson.setAddress(demoPersonAddress);
		try {
			demoPerson.setEmail("sam.griffith@taunting-teacher.com");
		} catch (InvalideEmailAddressException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			errors.add("EmailSetError on: " + demoPerson + " for error: " + e.getMessage());
		}
		demoPerson.setCellPhone("15125551212");
		return demoPerson;
	}
	

}













