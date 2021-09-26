package BiConsumerInterface;

import java.util.function.BiConsumer;

public class JavaBiConsumer2 {
	/*
	 * 2. Higher Order Function 2.1 This example accepts BiConsumer as an argument,
	 * create a generic addTwo to join two objects.
	 */
	
	public static void main(String[] args) {
		addTwo(10, 20, (x,y)->System.out.println(x+y));
		addTwo("swapnil", "Bodade", (x,y)->System.out.println(x+y));
		
	}
	
	
	public static <T> void addTwo(T x, T y, BiConsumer<T, T> c) {
			c.accept(x, y);
	}

}
