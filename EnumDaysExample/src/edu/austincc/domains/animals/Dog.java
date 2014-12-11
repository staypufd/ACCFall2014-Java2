package edu.austincc.domains.animals;

public class Dog extends Canine {

	String nickname;
	String address;
	
	
	public Dog(String name, int ageInYears, int numberOfTeeth,
			boolean sheds, String nickname, String address) {
		super(name, ageInYears, numberOfTeeth, sheds);
		this.nickname = nickname;
		this.address = address;
	}
	
	
	public void bark()
	{
		System.out.println("Roof!");
	}
	
	
}
