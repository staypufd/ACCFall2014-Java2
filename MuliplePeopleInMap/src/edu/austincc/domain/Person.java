package edu.austincc.domain;

public class Person implements Comparable  {

	String firstName;
	String lastName;
	int idNumber;
	String phoneNumber;
	
	
	public Person(String firstName, String lastName, int idNumber,
			String phoneNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
		this.phoneNumber = phoneNumber;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getIdNumber() {
		return idNumber;
	}


	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [firstName=").append(firstName)
				.append(", lastName=").append(lastName).append(", idNumber=")
				.append(idNumber).append(", phoneNumber=").append(phoneNumber)
				.append("]");
		return builder.toString();
	}


	@Override
	public int compareTo(Object arg0) {
		Person personToCompareTo = (Person)arg0;
		
		String myCompositeName = this.getLastName() + this.getFirstName();
		String theirCompositeName = personToCompareTo.getLastName() + personToCompareTo.getFirstName();
		
		return myCompositeName.compareToIgnoreCase(theirCompositeName);
	}
	
	
	
	
}
