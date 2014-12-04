import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;


public class CollectionsDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayListDemo();
		
		MapDemo();
	}

	private static void MapDemo() {
		Map<String, Integer> numberNameToValue = new TreeMap();
		
		numberNameToValue.put("One", 1);
		numberNameToValue.put("Two", 2);
		numberNameToValue.put("Three", 3);
		
		for (Integer theInt : numberNameToValue.values()) {
			System.out.println(theInt);
		}
		
		
		Map<Integer, String> numberValueToName = new TreeMap();
		numberValueToName.put(1, "One");
		numberValueToName.put(3, "Three");
		numberValueToName.put(2, "Two");
		numberValueToName.put(4, "Four");
		
		for (String theString : numberValueToName.values()) {
			System.out.println(theString);
		}
		
		for ( Entry<Integer, String> iterable_element : numberValueToName.entrySet()) {
			
			System.out.println("Key is: " + iterable_element.getKey() + " and value is: " + iterable_element.getValue());
		}
	}

	protected static void ArrayListDemo() {
		ArrayList<String> theThingsToAdd = new ArrayList<String>();
		theThingsToAdd.add("bar");
		theThingsToAdd.add("bazz");
		theThingsToAdd.add("blump");
		
		ArrayList<String> foo = new ArrayList<String>();
		
		foo.add("String");
		System.out.println(foo);
	
		
		foo.addAll(theThingsToAdd);	
		System.out.println("After adding theThingsToAdd");
		System.out.println(foo);
		
		// Add a null
		foo.add(null);
		
		foo.addAll(foo.size(), theThingsToAdd);
		System.out.println("After adding thingsToAddAfter Index 10");
		System.out.println(foo);
		
		
		ArrayList<String> theThingsToAddTwo = new ArrayList<String>();
		theThingsToAddTwo.add("abc");
		theThingsToAddTwo.add("def");
		theThingsToAddTwo.add("ghi");
		
		foo.addAll(3, theThingsToAddTwo);
		System.out.println("After adding thingsToAddAfter Index 10");
		System.out.println(foo);
		
		
		System.out.println(foo.size());
		
		System.out.println(foo.get(5));
		
		System.out.println(foo.indexOf(null));
		
		foo.set(4, "Sam is a fun teacher who's \"late\" with comedy that's good!");
		
		System.out.println(foo);
	}

}
