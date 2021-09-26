package OptionalClass;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalToString {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("a", "b", "c", "d", "e");
		
		
//Optional class
		Optional<String> optional = list.stream().findFirst();
		System.out.println(optional);
		if(optional.isPresent()) {
			System.out.println(optional.get());
		}

		
//Converting optional to String by using Try map(Object::toString)
		
		String string = list.stream().findFirst().map(Object::toString).orElse(null);
		System.out.println(string);

	}

}
