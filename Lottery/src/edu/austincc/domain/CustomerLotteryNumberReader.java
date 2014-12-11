package edu.austincc.domain;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CustomerLotteryNumberReader {

	Set<Integer> pickedNumbers = new HashSet<Integer>();

	public Set<Integer> getCustomerPicks() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please input seven random numbers \n between 1 and 49 for your picks!");
		 
		while (pickedNumbers.size() != 7) {
			// Read a number from the User
			System.out.println("Input a number: ");
			int newNumber = s.nextInt();
			if ( (newNumber >= 1) && (newNumber <= 49) ) {
				pickedNumbers.add(newNumber);
			}
		}
		
		s.close();
		
		return pickedNumbers;
	}
	
	
}
