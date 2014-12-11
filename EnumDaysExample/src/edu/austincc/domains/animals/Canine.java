package edu.austincc.domains.animals;

public class Canine extends Mammal {

	protected int numberOfTeeth;
	protected boolean sheds;
	
	
	protected Canine(String name, int ageInYears, int numberOfTeeth,
			boolean sheds) {
		super(name, ageInYears);
		this.numberOfTeeth = numberOfTeeth;
		this.sheds = sheds;
	}
	

	
}
