package ConsumerExample;

import java.util.function.Consumer;

public class java8Consumer1 {
	/*
	 * // In Java 8, Consumer is a functional interface; it takes an argument and //
	 * returns nothing.
	 * 
	 * //1. Consumer
	 */
	
	public static void main(String[] args) {

		Consumer<String> print = x -> System.out.println(x);
		print.accept("swap");
		
	}
	
	

}
