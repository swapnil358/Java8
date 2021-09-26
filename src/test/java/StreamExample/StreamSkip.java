package StreamExample;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

//https://mkyong.com/java8/java-8-get-the-last-element-of-a-stream/
public class StreamSkip {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("python", "java", "c++", "react", "javascript");

		// get last element from a list
		String result = list.get(list.size() - 1);
		System.out.println(result);
		
		
		
		
		// get last element from a stream, via skip
		String result2 = list.stream().skip(list.size()-1).findFirst().orElse("no element found");
		System.out.println(result2);
		
		
	}

}
