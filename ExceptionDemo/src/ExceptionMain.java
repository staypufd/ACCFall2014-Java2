import java.util.ArrayList;
import java.util.Scanner;

import org.w3c.dom.ranges.RangeException;


public class ExceptionMain {

	public static void main(String[] args) {

		
		int x = divideByZeroExceptionExample();
		System.out.println("X is: " + x);
		
		int y;
		try {
			y = calcSize(22);
		} catch (OutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			y = 0;
		}
		
		System.out.println(y);
		
		
		arrayListExceptionsDemo();
		
		personIntegerExample();
		
		numberFormatExceptionDemo();
		
		regExExample();
	}

	private static void regExExample() {
		RegexMatches rm = new RegexMatches();
		rm.regExDemo();
		
	}

	private static void numberFormatExceptionDemo() {
		
		Scanner s = new Scanner(System.in);
	
		float ourFloat = -1;
		try {
			System.out.println("Type in a floating point number: ");
			ourFloat = s.nextFloat();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			 e.printStackTrace();
			System.out.println("An Error on your input occured using -1");
		}
		
		System.out.println("You typed in:" + ourFloat);
		
		s.close();
	}

	private static void personIntegerExample() {
		Person p = new Person();
		
		// Autoboxed to an Integer for the call
		p.setAge(6);
		
		// Auto-Unboxed to an int from the return value of Integer
		int personAge = p.getAge();
		
		
		System.out.println(personAge);
		
	}

	private static void arrayListExceptionsDemo() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(6);
		al.add(new Integer(11));
		
		Integer theEleven = al.get(1);
		System.out.println("The Eleven is: " + theEleven);
		
		int z = al.get(1);
		System.out.println(z);
		
	}

	protected static int divideByZeroExceptionExample() {
		try {
			return 1/0;
		} catch (ArithmeticException ae) {
			System.out.println("We tried to divide by zero. Returning 1 instead");
			
			// We could do this as well since it's a RunTimeException
			// throw ae;
			
			// But we'll do this instead
			// Return a default value
			return 1;
		}
		

	}
	
	
	
	public static int calcSize(int x) throws OutOfBoundsException
	{
		if (x > 20) {
			throw new OutOfBoundsException("You exeeded the max bounds value of 20");
		}
		return 50 * x;
	}

}
