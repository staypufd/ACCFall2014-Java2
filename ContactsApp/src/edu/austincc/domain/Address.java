package edu.austincc.domain;

public class Address {
	public String street1;
	public String street2;
	public String city;
	public State state;
	public String postalCode;
	
	public Address(String street1, String street2, String city, State state,
			String postalCode) {
		super();
		this.street1 = street1;
		this.street2 = street2;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Address [street1=").append(street1)
				.append(", street2=").append(street2).append(", city=")
				.append(city).append(", state=").append(state)
				.append(", postalCode=").append(postalCode).append("]");
		return builder.toString();
	}
	
	
	
}
