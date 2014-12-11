package edu.austincc.domains;

import java.util.Random;

import edu.austincc.enums.CarManufactures;
import edu.austincc.enums.Day;
import edu.austincc.enums.RockPaperSissors;

public class EnumTest {

	    Day day;
	    
	    public EnumTest(Day day) {
	        this.day = day;
	    }
	    
	    public void tellItLikeItIs() {
	        switch (day) {
	            case MONDAY:
	                System.out.println("Mondays are bad.");
	                break;
	                    
	            case FRIDAY:
	                System.out.println("Fridays are better.");
	                break;
	                         
	            case SATURDAY: case SUNDAY:
	                System.out.println("Weekends are best.");
	                break;
	                        
	            default:
	                System.out.println("Midweek days are so-so.");
	                break;
	        }
	    }
	    
	    public static void main(String[] args) {
	        EnumTest firstDay = new EnumTest(Day.MONDAY);
	        firstDay.tellItLikeItIs();
	        EnumTest thirdDay = new EnumTest(Day.WEDNESDAY);
	        thirdDay.tellItLikeItIs();
	        EnumTest fifthDay = new EnumTest(Day.FRIDAY);
	        fifthDay.tellItLikeItIs();
	        EnumTest sixthDay = new EnumTest(Day.SATURDAY);
	        sixthDay.tellItLikeItIs();
	        EnumTest seventhDay = new EnumTest(Day.SUNDAY);
	        seventhDay.tellItLikeItIs();
	        
	        
	        for (Day i : Day.values()) {
				System.out.println(i);
			}
	        
	        
	        Vehicle myCar1 = new Vehicle(CarManufactures.HONDA, 22440);
	        System.out.println(myCar1);
	        
	        System.out.println(CarManufactures.ACCURA.ordinal());
	        
	        for (CarManufactures carManu : CarManufactures.values()) {
				System.out.print(carManu);
				System.out.println(" - " + carManu.ordinal());
				
				if (carManu == CarManufactures.CHEVY) {
					System.out.println("Chevy's suck!");
				}
			}
	        
	        
	        Random r = new Random();
	        int theRandNum = r.nextInt(RockPaperSissors.values().length);
	        RockPaperSissors theRandomChoice = RockPaperSissors.values()[theRandNum];
	        System.out.println(theRandomChoice);
	        if (theRandomChoice == RockPaperSissors.SISSORS) {
	        	System.out.println("You cut me man!");
	        }
	    }
	}





















