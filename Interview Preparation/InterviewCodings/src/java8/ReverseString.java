package java8;

import java.util.*;
import java.util.stream.*;

public class ReverseString 
{
	public static void main(String[] args) 
	{
//		Reversing String using java 8
		String str = "Java8";
		String reversed = new StringBuilder(str)
		    .reverse()
		    .toString();
		System.out.println(reversed);
		
//		find longest word
		List<String> words = Arrays.asList("Java", "Python", "JavaScript");
		String longest = words.stream()
		    .max(Comparator.comparingInt(String::length))
		    .orElse("");
		System.out.println(longest);
		
//		Finding Prime
		int num = 29;
		boolean isPrime = num > 1 && IntStream
						.rangeClosed(2, (int)Math.sqrt(num))
						.noneMatch(n -> num % n == 0);
		System.out.println(num+" is Prime? "+isPrime);
		
//		Sorting list by string length
		List<String> names = Arrays.asList("John", "Alexander", "Amy");
		List<String> sorted = names.stream()
		    .sorted(Comparator.comparingInt(String::length))
		    .collect(Collectors.toList());
		System.out.println(sorted);
	}
}
