package InterCodes;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemovingDuplicateStream {
    public static void main(String[] args) {
        // Input array with duplicates
        Integer[] numbers = {1, 2, 2, 3, 4, 4, 5, 1};

        // Remove duplicates using Stream API and collect back to an array
        Integer[] uniqueNumbers = Arrays.stream(numbers)
			                    .distinct() // removes duplicates
			                    .toArray(Integer[]::new); // collect to array
        // Output the result
        System.out.println("Array after removing duplicates:");
        System.out.println(Arrays.toString(uniqueNumbers));
    }
}

