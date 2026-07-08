package basicCodes;

import java.util.*;

public class DuplicateFind 
{
	public static void main(String[] args) 
	{
        int[] nums = {1, 2, 3, 4, 5, 2, 6, 7, 8, 3};
        Set<Integer> set = new HashSet<>();
        boolean hasDuplicates = false;
        for (int num : nums) {
            if (!set.add(num)) {
                hasDuplicates = true;
                break;
            }
        }
        if (hasDuplicates) {
            System.out.println("Duplicates found in the array.");
        } else {
            System.out.println("No duplicates found in the array.");
        }
    }
}
