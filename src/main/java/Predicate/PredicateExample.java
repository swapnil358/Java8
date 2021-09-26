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
	        return stringList.stream().filter(s -> s.startsWith("a")).collect(Collectors.toList());
	    }

}
