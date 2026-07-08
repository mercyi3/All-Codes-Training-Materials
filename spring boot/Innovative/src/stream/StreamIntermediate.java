package stream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamIntermediate {
    public static void main(String[] args) 
    {
        List<List<String>> listOfLists = Arrays.asList(
            Arrays.asList("Reflection", "Collection", "Stream"),
            Arrays.asList("Structure", "State", "Flow"),
            Arrays.asList("Sorting", "Mapping", "Reduction", "Stream")
        );

        Set<String> intermediateResults = new HashSet<>();

        List<String> result = listOfLists.stream()
        	.flatMap(List::stream)               // Flatten the list of lists into a single stream
            .filter(s -> s.startsWith("S"))      // Filter elements starting with "S" 5
            .map(String::toUpperCase)            // Transform each element to uppercase
            .distinct()                          // Remove duplicate elements 4 data
            .sorted()                            // Sort elements
            .peek(s -> intermediateResults.add(s)) // Perform an action (add to set) on each element
            .collect(Collectors.toList());       // Collect the final result into a list

        System.out.println("Intermediate Results:");
        intermediateResults.forEach(System.out::println);

        System.out.println("Final Result:");
        result.forEach(System.out::println);
    }
}