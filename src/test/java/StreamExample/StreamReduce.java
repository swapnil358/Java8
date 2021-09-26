package StreamExample;

import java.util.Arrays;
import java.util.List;

//1. Stream.reduce
public class StreamReduce {
	
	
	public static void main(String[] args) {

		List<String> list = Arrays.asList("python", "java", "c++", "react", "javascript");

		String result = list.stream().reduce((first, second) -> first).orElse("no last element");
		System.out.println(result);
		
		

	}
}
