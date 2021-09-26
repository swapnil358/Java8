package Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.google.common.base.Predicate;

public class StringProcessor {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB");
		System.out.println(StringProcessor.filter(list, e -> e.startsWith("A")));

	}

	
	//Predicate.test() function
	public static List<String> filter(List<String> list, Predicate<String> predicate) {
		return list.stream().filter(predicate::test).collect(Collectors.toList());
	}

}
