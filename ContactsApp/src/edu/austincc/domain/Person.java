package edu.austincc.domain;

import java.util.Date;

import edu.austincc.utils.validators.EmailFormatValidator;

public class Person {

	String firstName;
	String lastName;
	Date birthDay;
	Address address;
	String email;
	String cellPhone;
	
	
	public Person(String firstName, String lastName, Date birthDay) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDay = birthDay;
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


	public Date getBirthDay() {
		return birthDay;
	}


	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) throws InvalideEmailAddressException {
		
		EmailFormatValidator ev = new EmailFormatValidator();
		if (ev.validate(email) != true) {
			throw new InvalideEmailAddressException("The email address string provide is not conformate with the standard!");
		}
		
		this.email = email;
	}

	public String getCellPhone() {
		return cellPhone;
	}


	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [firstName=").append(firstName)
				.append(", lastName=").append(lastName).append(", birthDay=")
				.append(birthDay).append(", address=").append(address)
				.append(", email=").append(email).append(", cellPhone=")
				.append(cellPhone).append("]");
		return builder.toString();
	}
	
	
	
}
