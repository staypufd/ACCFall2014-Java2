package edu.austincc.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import edu.austincc.domain.Person;

public class App {

	private ArrayList<Person> people = new ArrayList();
	private HashMap<String, ArrayList<Person>> lastNameIndex = new HashMap();
	private HashMap<Integer, Person> idIndex = new HashMap();
	private ArrayList<Character> vowels = new ArrayList();

	public App() {
		super();
		
		this.initializeInitialPeople();
		this.initializeLastNameIndex();
		this.initializeIDIndex();
		this.initializeVowels();
	}

	protected void initializeInitialPeople() {
		Person p1 = new Person("Ender", "Wiggin", 1122, "555-1111");
		Person p2 = new Person("Maria", "Macarena", 7788, "555-2222");
		Person p3 = new Person("Harry", "Potter", 9955, "555-3333");
		Person p4 = new Person("Honor", "Harrington", 8888, "555-4444");
		Person p5 = new Person("R.Daneel", "Olivaw", 5555, "555-5555");
		Person p6 = new Person("Peter", "Parker", 1234, "555-666");
		Person p7 = new Person("Bob", "Hope", 4445, "555-1212");
		Person p8 = new Person("Ann", "Hope", 4446, "555-1213");
		
		people.add(p1);
		people.add(p2);
		people.add(p3);
		people.add(p4);
		people.add(p5);
		people.add(p6);
		people.add(p7);
		people.add(p8);
	}



	private void initializeLastNameIndex() {
		for (Person person : people) {
			ArrayList<Person> thePeopleAtLastName = lastNameIndex.get(person.getLastName());
			
			// If no array list at the lastname index value, create one, 
			// add person to it and put it in the map at the lastname as the key
			// otherwise just add the person to the arraylist that is already at the lastname
			if (thePeopleAtLastName == null) {
				thePeopleAtLastName = new ArrayList<Person>();
				thePeopleAtLastName.add(person);
				lastNameIndex.put(person.getLastName(), thePeopleAtLastName);
			} else { 
				thePeopleAtLastName.add(person);
			}
		}
		
	}
	

	private void initializeIDIndex() {
		for (Person person : people) {
			int theID = person.getIdNumber();
			idIndex.put(new Integer(theID), person);
		}
	}
	
	// Don't use base types when declaring an array.  Use the class type for autoboxing
	protected void initializeVowels() {
		Character[] vowelsChars = {'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U' };
		List<Character> vowelCharsList = Arrays.asList(vowelsChars);
		vowels.addAll(vowelCharsList);
	}
	


	protected ArrayList<Person> findPeopleWithLastName(String lastName) {
		ArrayList<Person> people = lastNameIndex.get(lastName);

		return people;
	}

	private Person findPersonWithId(int theID) {
		Person p = idIndex.get(new Integer(theID));
		return p;
	}
	

	
	private ArrayList<Person> findPeopleWithIDGreaterThan(int num) {
		ArrayList<Person> foundPeople = new ArrayList();
		
		for (Person person : people) {
			if (person.getIdNumber() > num) {
				foundPeople.add(person);
			}
		}
		
		return foundPeople;
	}
	

	

	
	private ArrayList<Person> findPeopleWhosNamesStartWithVowels() {
		ArrayList<Person> foundPeople = new ArrayList();

		for (Person person : people) {
			char lastNameFirstChar = person.getLastName().charAt(0);
			char firstNameFirstChar = person.getFirstName().charAt(0);
			
			if (vowels.contains(lastNameFirstChar) || vowels.contains(firstNameFirstChar)) {
				foundPeople.add(person);
			}
		}
		
		return foundPeople;
	}

	
	// Print People Methods
	public void printFoundPerson(Person person) {
		if (person != null) {
			System.out.println("We found " + person.getLastName() + " they are: \n" + person);
		} else {
			System.out.println("Didn't find the person");
		}
	}
	
	private void printPeopleArray(ArrayList<Person> foundPeople) {
		for (Person person : foundPeople) {
			System.out.println(person);
		}
		
	}
	
	
	// Main Method
	public static void main(String[] args) {
		
		App myApp = new App();
		

		// Do the searches
		myApp.printPeopleArray(myApp.findPeopleWithLastName("Potter"));
		
		Person theFoundPersonWithID = myApp.findPersonWithId(1234);
		myApp.printFoundPerson(theFoundPersonWithID);
		
		
		System.out.println("-----------");
		// Find people with ID's greater than 5000
		int num = 5000;
		ArrayList<Person> foundPeople = myApp.findPeopleWithIDGreaterThan(num);
		myApp.printPeopleArray(foundPeople);
		
		
		System.out.println("===============");
		ArrayList<Person> firstVowelPeople = myApp.findPeopleWhosNamesStartWithVowels();
		myApp.printPeopleArray(firstVowelPeople);
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^");
		ArrayList<Person> theHopes = myApp.findPeopleWithLastName("Hope");
		Collections.sort(theHopes);
		myApp.printPeopleArray(theHopes);

	}

	
}



















