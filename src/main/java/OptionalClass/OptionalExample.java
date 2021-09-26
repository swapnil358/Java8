package OptionalClass;

import java.util.Optional;

public class OptionalExample {

	// https://youtu.be/S1Cwj2ubIhs

	
	
	
	public static void main(String[] args) {

		String s = "swapnil";
		String s1 = "swapni";

		//Null check using if condition
		if (s == null) {
			System.out.println("object is null");
		} else {
			System.out.println(s.length());
		}
		
		
		//null check using optional class
		
		Optional<String> optional = Optional.ofNullable(s);
		
		Optional<String> optional2 = Optional.ofNullable(s1);
		
		System.out.println(optional);
		
		System.out.println(optional.isPresent()); //it will return true or false--> if present will return true otherwise false
		
		System.out.println(optional.isEmpty());
		
		System.out.println(optional.equals(optional2));
		
	
		
		
		
		
		
	}
}
