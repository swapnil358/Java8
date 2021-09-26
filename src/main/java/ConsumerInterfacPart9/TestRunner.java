package ConsumerInterfacPart9;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TestRunner {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("swapni", "bodade", "test", "automation");

		for (int i = 0; i < list.size(); i++) {
			System.out.println("using index for loop: "+list.get(i));

		}
		
		
		for(String ls : list) {
			System.out.println("using for each loop: "+ls);
		}
		
		
		Consumer<String> consumer = (s)->System.out.println("using java8"+s);
		list.forEach(consumer);
	}
	
	

}
