package edu.austincc.domains.animals;

public abstract class Mammal {
	protected String name;
	protected int ageInYears;
	
	
	protected Mammal(String name, int ageInYears) {
		super();
		this.name = name;
		this.ageInYears = ageInYears;
	}


	public String getName() {
		return name;
	}

	
	
}
