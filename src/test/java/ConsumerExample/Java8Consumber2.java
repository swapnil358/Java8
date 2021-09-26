package ConsumerExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Java8Consumber2 {

	/*
	 * 2. Higher Order Function 2.1 This example accepts Consumer as an argument,
	 * simulates a forEach to print each item from a list.
	 */

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

		Consumer<Integer> consumer = (x) -> System.out.println(x);
		forEach(list, consumer);
		
		
		forEach(list, (x) -> System.out.println(x));
		
		
	}
	
	public static <T> void forEach(List<T> ls, Consumer<T> consumer) {
		for(T t : ls) {
			consumer.accept(t);
		}
	}
}
