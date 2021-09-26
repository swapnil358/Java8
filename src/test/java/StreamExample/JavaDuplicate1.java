package StreamExample;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;

public class JavaDuplicate1 {
	/*
	 * 1. Filter & Set.add() The Set.add() returns false if the element was already
	 * in the set; let see the benchmark at the end of the article.
	 */

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(3, 5, 6, 4, 8, 9, 1, 2, 3, 5, 4, 6);

	}

	public static <T> void findDuplicate(List<T> ls) {

		Set<T> set = new HashSet<>();

	//	ls.stream().filter(n -> !set.add(n)).
	//	collect(Collector.toSet());
	}

}
