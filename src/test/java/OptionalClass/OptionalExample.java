package OptionalClass;

import java.util.Optional;

public class OptionalExample {

	// https://youtu.be/S1Cwj2ubIhs

	
	/*
	 * https://mkyong.com/java8/java-8-optional-in-depth/
	  
	 
	 * Java 8 has introduced a new class Optional in java.util package. It is used
	 * to represent a value is present or absent. The main advantage of this new
	 * construct is that No more too many null checks and NullPointerException. It
	 * avoids any runtime NullPointerExceptions and supports us in developing clean
	 * and neat Java APIs or Applications. Like Collections and arrays, it is also a
	 * Container to hold at most one value. Let us explore this new construct with
	 * some useful examples.
	 * 
	 * Advantages of Java 8 Optional:
	 * 
	 * Null checks are not required. \
	 * No more NullPointerException at run-time. 
	 * We can develop clean and neat APIs. 
	 * No more Boiler plate code
	 */

	public static void main(String[] args) {

		String s = "swapnil";
		String s1 = "swapni";

		// Null check using if condition
		if (s == null) {
			System.out.println("object is null");
		} else {
			System.out.println(s.length());
		}

		// null check using optional class

		Optional<String> optional = Optional.ofNullable(s);

		Optional<String> optional2 = Optional.ofNullable(s1);

		System.out.println(optional);

		System.out.println(optional.isPresent()); // it will return true or false--> if present will return true
													// otherwise false

		System.out.println(optional.isEmpty());

		System.out.println(optional.equals(optional2));

	}
}
