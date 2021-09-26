package Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.google.common.base.Predicate;

public class PredicateExample {
	
	 public static void main(String[] args) {
	        System.out.println(method1());
	        System.out.println(predicateAND());
	        System.out.println(predicateOR());
	        System.out.println(predicateNegate());
	         List<String> stringList = Arrays.asList("apple", "mango","banana", "orange");
	        System.out.println(StringProcessor.filter(stringList, e -> e.startsWith("a")));
	        System.out.println( predicateChaining("swapnil"));

	    }

	    static List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9,10);
	    static List<String> stringList = Arrays.asList("apple", "mango","banana", "orange");

	    public static List<Integer> method1(){
	        return integerList.stream().filter(s -> s > 7).collect(Collectors.toList());
	    }

	    //2. Predicate.and()
	    public static List<Integer> predicateAND() {

	        final Predicate<Integer> greaterThan5 = x -> x > 5;
	        final Predicate<Integer> lessThan7 = x -> x < 7;
	        return integerList.stream().filter(greaterThan5.and(lessThan7)).collect(Collectors.toList());
	    }

	    //3. Predicate.or()
	    public static List<Integer> predicateOR(){

	        final Predicate<Integer> greaterThan5 = x -> x > 55;
	        final Predicate<Integer> equalTo5 = x -> x == 5;

	        return integerList.stream().filter(greaterThan5.or(equalTo5)).collect(Collectors.toList());
	    }

	    //4. Predicate.negate()
	    public static List<String> predicateNegate(){

	        List<String> list = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB");
	        Predicate<String> startWithA = x -> x.startsWith("A");

	        return list.stream().filter(startWithA.negate()).collect(Collectors.toList());
	    }


	    //5. Predicate.test() in function
	    static class StringProcessor {
	         static List<String> filter(List<String> list, Predicate<String> predicate) {
	            return list.stream().filter(predicate::test).collect(Collectors.toList());
	        }
	    }

	    //6. Predicate chaining --> OR and AND function

	    public static boolean predicateChaining(String test){
	        Predicate<String> startWithA = x -> x.startsWith("s");
	        return startWithA.or(x -> x.startsWith("m")).test(test);
	    }


}
