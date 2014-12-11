import edu.austincc.domains.animals.Dog;
import edu.austincc.enums.AnimalShelterMascots;
import edu.austincc.enums.Breed;


public class AnimalShelterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog x = new Dog("Fido", 3, 20, true, "Butthead", "102 South St. Austin, TX. 78744");
		
		System.out.println(x.getName());
		System.out.println(x);
		
		for (Breed b : Breed.values()) {
			System.out.println(b);
		}

		for (AnimalShelterMascots mascot : AnimalShelterMascots.values()) {
			System.out.println(mascot);
			System.out.println(mascot.getBreed());
		}
		
	}
}
