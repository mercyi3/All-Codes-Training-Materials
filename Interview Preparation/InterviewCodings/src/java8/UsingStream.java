package java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class UsingStream {

	public static void main(String[] args) {
//		Merge 2 list remove duplicate
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
		List<Integer> list2 = Arrays.asList(3, 4, 5, 6);
		List<Integer> merged = Stream.concat(list1.stream(), list2.stream())
		    .distinct()
		    .collect(Collectors.toList());
		System.out.println(merged);
		
//		Count number of vowels in a string
		String str = "Interview";
		long vowelCount = str.toLowerCase().chars()
		    .filter(c -> "aeiou".indexOf(c) >= 0)
		    .count();
		System.out.println(vowelCount);
		
//		Find the maximum occurring element in a list
		List<String> items = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
		String maxItem = items.stream()
		    .collect(Collectors.groupingBy
		      (Function.identity(), Collectors.counting()))
		    .entrySet().stream()
		    .max(Map.Entry.comparingByValue())
		    .map(Map.Entry::getKey)
		    .orElse(null);
		System.out.println(maxItem);
		
//		Convert a list of strings to uppercase and remove duplicates
		List<String> names = Arrays.asList("john", "doe", "john");
		List<String> upperUnique = names.stream()
		    .map(String::toUpperCase)
		    .distinct()
		    .collect(Collectors.toList());
		System.out.println(upperUnique);
	}
}
