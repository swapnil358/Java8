package ConsumerExample;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class java8ConsumerForEach {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("a", "ab", "abc");

		Consumer<String> consumer = (s) -> System.out.println(s);
		forEach(list, consumer);
		
		
		forEach(list, (s) -> System.out.println(s));
		
		
	}

	public static <T> void forEach(List<T> ls, Consumer<T> c) {

		for (T t : ls) {
			c.accept(t);
		}
	}

}
