package edu.austincc.enums;


public enum AnimalShelterMascots {
	FIDO (Breed.JACK_RUSSEL_TERRIER, "12-18-2013"),
	SNOOPY(Breed.GERMAN_SHEPARD, "4-12-1962");
	
	private final Breed breed;   // in kilograms
    private final String adoptionDate; // in meters

    AnimalShelterMascots(Breed b, String dateString) {
        this.breed = b;
        this.adoptionDate = dateString;
    }
    
    public Breed getBreed()
    {
    	return this.breed;
    }
}
