package java8;

import java.util.*;
import java.util.stream.*;

public class UsingFlatMap {
	public static void main(String[] args) 
	{
//		Flatten a list of lists using flatMap
		List<List<String>> nested = Arrays.asList(
			    Arrays.asList("a", "b"),
			    Arrays.asList("c", "d")
			);
			List<String> flatList = nested.stream()
			    .flatMap(Collection::stream)
			    .collect(Collectors.toList());
			System.out.println(flatList);
			
//			Find common elements between two lists
			List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
			List<Integer> list2 = Arrays.asList(3, 4, 5, 6);
			List<Integer> common = list1.stream()
			    .filter(list2::contains)
			    .collect(Collectors.toList());
			System.out.println(common); // Output: [3, 4]
			
//			Sort a Map by its values
			Map<String, Integer> map = new HashMap<>();
			map.put("apple", 3);
			map.put("banana", 2);
			map.put("orange", 5);
			map.put("lemon", 1);
			Map<String, Integer> sortedByValue = map.entrySet().stream()
			    .sorted(Map.Entry.comparingByValue())
			    .collect(Collectors.toMap(
			        Map.Entry::getKey,
			        Map.Entry::getValue,
			        (e1, e2) -> e1,
			        LinkedHashMap::new
			    ));
			System.out.println(sortedByValue);
			
//			Find sum and average of a list of numbers
			List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
			int sum = numbers.stream().mapToInt(Integer::intValue).sum();
			double avg = numbers.stream().mapToInt(Integer::intValue).average().orElse(0.0);
			System.out.println("Sum: " + sum);
			System.out.println("Average: " + avg);
	}
}
