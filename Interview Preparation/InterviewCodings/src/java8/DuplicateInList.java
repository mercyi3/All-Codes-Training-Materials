package java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateInList 
{
	public static void main(String[] arg)
	{
		List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3, 6);
		Set<Integer> duplicates = list.stream()
		    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		    .entrySet().stream()
		    .filter(e -> e.getValue() > 1)
		    .map(Map.Entry::getKey)
		    .collect(Collectors.toSet());
		System.out.println(duplicates);
	}
}
