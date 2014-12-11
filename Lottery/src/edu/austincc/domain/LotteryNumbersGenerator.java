package edu.austincc.domain;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LotteryNumbersGenerator {

	Set<Integer> generatedNumbers = new HashSet<Integer>();
	
	public Set<Integer> generateSevenRandomNumbers() 
	{
		while (generatedNumbers.size() != 7) {
			int randNum = new Random().nextInt(49) + 1;
			generatedNumbers.add(randNum);
		}
		 
		return generatedNumbers;
	}
}
