package PassingLamdasBehaviorAsMethodParameter;

import java.util.function.Consumer;

public class testRunner {
	
	//https://www.youtube.com/watch?v=djf-TlD7x4M&list=PL9ok7C7Yn9A_o6wKmhObLceifmpoQ9QNp&index=8
	
	
	static void perform(Animal animal) {
		animal.run();
	}
	
	public static void main(String[] args) {
		Animal animal = new Dog();
		perform(animal);
		
		
		
		//Animal animal1 = ()->System.out.println("Running at 100 kmph");
		
		//Passing a lambda as input parameter to perform method
		perform(()->System.out.println("Running at 100 kmph"));
		
		//Exmaples
		
	//	uppperCase("Swapnil");
	//	lowerCase("SWAPNIL");
		
		usingCounsumer((s)->System.out.println(s.toUpperCase()), "swapnil");
		usingCounsumer((s)->System.out.println(s.toLowerCase()), "swapnil");
		
	}
	
	public static void usingCounsumer(Consumer<String> consumer, String temp) {
		consumer.accept(temp);
	}
	

	private static void lowerCase(String string) {
		System.out.println(string.toLowerCase());
		
	}

	private static void uppperCase(String string) {
		System.out.println(string.toUpperCase());
		
	}
	
	
	
	
	
	
	

}
