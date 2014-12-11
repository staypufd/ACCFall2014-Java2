package edu.austincc.domains;

import edu.austincc.enums.CarManufactures;

public class Vehicle {
	CarManufactures kind;
	int	mileage;
	
	
	public Vehicle(CarManufactures kind, int mileage) {
		super();
		this.kind = kind;
		this.mileage = mileage;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Vehicle [kind=").append(kind).append(", mileage=")
				.append(mileage).append("]");
		return builder.toString();
	}
	
	
	
}
