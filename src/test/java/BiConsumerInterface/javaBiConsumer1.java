package BiConsumerInterface;

import java.util.function.BiConsumer;

public class javaBiConsumer1 {
	
	public static void main(String[] args) {
		
		//1. BiConsumer
		BiConsumer<Integer,Integer> addTwo = (x, y) -> System.out.println(x+y);
		addTwo.accept(1,2);
		
	}
	
}
