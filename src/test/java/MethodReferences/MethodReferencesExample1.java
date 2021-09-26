package MethodReferences;

import java.util.Arrays;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

/*
 * Reference to a static method ClassName::staticMethodName
Reference to an instance method of a particular object Object::instanceMethodName
Reference to an instance method of an arbitrary object of a particular type ContainingType::methodName–
Reference to a constructor ClassName::new
 */

// This example converts a list of Strings into a list of Integers, 
//method reference to a static method Integer::parseInt.

public class MethodReferencesExample1 {

	public static void main(String[] args) {
		
		   List<String> list = Arrays.asList("1", "2", "3");
		   
		   List<Integer> collect = list.stream().map(s->Integer.parseInt(s)).collect(Collectors.toList());
		   System.out.println(collect);
		   
		   
		   List<Integer> collect2 = list.stream().map(Integer::parseInt).collect(Collectors.toList());
		   System.out.println(collect2);

	}

}
