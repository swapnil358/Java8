package OptionalClass;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionToString {
	
	/*
	 * A standard Optional way to get a value.
	 */
	
	
	public static void main(String[] args) {
		
		 List<String> list = Arrays.asList("a", "b", "c", "d", "e");

		Optional<String> result = list.stream().filter(s->s.length()==1).findFirst();
		System.out.println(result);
		
		if(result.isPresent()) {
			System.out.println(result.get());
		}
	}

}
