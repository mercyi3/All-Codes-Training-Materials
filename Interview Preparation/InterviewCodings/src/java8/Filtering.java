package java8;

import java.util.*;
import java.util.stream.Collectors;

public class Filtering {

	public static void main(String[] args) 
	{
//		Find all elements greater than a given value
		List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25);
		List<Integer> filtered = numbers.stream()
		    .filter(n -> n > 15)
		    .collect(Collectors.toList());
		System.out.println(filtered);
		
//		Group list of strings by their length
		List<String> names = Arrays.asList("java", "python", "go", "rust");
		Map<Integer, List<String>> grouped = names.stream()
		    .collect(Collectors.groupingBy(String::length));
		System.out.println(grouped);
		// Output: {2=[go], 4=[java, rust], 6=[python]}
		
//		Remove null and empty strings from a list
		List<String> raw = Arrays.asList("apple", "", null, "banana", " ", "grape");
		List<String> cleaned = raw.stream()
				.filter(s -> s != null && !s.trim().isEmpty())
				.collect(Collectors.toList());
		System.out.println(cleaned);
		
//		Convert a list of strings to a comma-separated string
		List<String> list = Arrays.asList("apple", "banana", "cherry");
//      String result = String.join(",", list);
		String result = list.stream().collect(Collectors.joining(","));
        System.out.println(result);
	}

}
