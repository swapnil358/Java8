package SeleniumPractice;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapIterat {

	public static void main(String[] args) {

		
		Map<String, Integer> map1 = new java.util.HashMap<>();
		map1.put("apple", 1);
		map1.put("banana", 2);
		map1.put("organge", 3);
		
		//Method1(map1);
		
		//Method2(map1);

		Method3(map1);
		
	}

	//using lambda java8
	private static void Method3(Map<String, Integer> map) {
		map.forEach((k, v) -> System.out.println((k + ":" + v)));
		
	}

	// EntrySet and for Loop
	private static void Method2(Map<String, Integer> map) {
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
	
	

	// Iterator and EntrySet
	private static void Method1(Map<String,Integer> map) {
		
		Iterator<Entry<String, Integer>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Entry<String, Integer> next = it.next();
			String key = next.getKey();
			Integer value = next.getValue();
			
			System.out.println(key + ":" + value);

		}

	}

}
