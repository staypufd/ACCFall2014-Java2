package edu.austincc.app;

import java.util.ArrayList;
import java.util.Set;

import edu.austincc.domain.CustomerLotteryNumberReader;
import edu.austincc.domain.LotteryNumbersGenerator;

public class Lottery {
	
	public Lottery() {
		super();
		LotteryNumbersGenerator lng = new LotteryNumbersGenerator();
		CustomerLotteryNumberReader clr = new CustomerLotteryNumberReader();
		
		Set<Integer> theLotteryNubmers = lng.generateSevenRandomNumbers();
		Set<Integer> theCustomerPickedNumbers = clr.getCustomerPicks();
		
		ArrayList<Integer> theMatches = this.comparePicksToLotteryNumbers(theLotteryNubmers, theCustomerPickedNumbers);
		
		if (theMatches.size() > 0) {
			this.printMatchMessage(theMatches);
		} else {
			System.out.println("No matches found");
		}
	}

	private void printMatchMessage(ArrayList<Integer> theMatches) {
		
		System.out.println("Your matches where: " + theMatches + "\n");
	
		switch (theMatches.size()) {
		case 3:
			System.out.println("Triple Match Winner!");
			break;
		case 4:
			System.out.println("Quad Match Winner!");
			break;
		case 5:
			System.out.println("Penta Match Winner!");
			break;
		case 6:
			System.out.println("Hexa Match Winner!");
			break;
		case 7:
			System.out.println("Power Ball Winner!");
			break;
		default:
			break;
		}
		
	}

	private ArrayList<Integer> comparePicksToLotteryNumbers(Set<Integer> theLottoNums, Set<Integer> cutomerNums) {
		
		ArrayList<Integer> matchedNumbers =  new ArrayList<Integer>();
	
		for (Integer lottoNum : theLottoNums) {
			if (cutomerNums.contains(lottoNum)) {
				matchedNumbers.add(lottoNum);
			}
		}
		
		return matchedNumbers;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lottery myFirstLottery = new Lottery();
		
	}

}





