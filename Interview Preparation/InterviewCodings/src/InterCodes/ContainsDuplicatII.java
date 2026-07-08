package InterCodes;

import java.util.TreeMap;

public class ContainsDuplicatII {
	
    public static void main(String[] args) 
    {
        int[] nums = {1,2,3,1};
        int indexDiff = 3, valueDiff = 0;
        
        System.out.println(containsDuplicate(nums, indexDiff, valueDiff)); // Output: false
    }

    public static boolean containsDuplicate(int[] nums, int indexDiff, int valueDiff) 
    {
        if (indexDiff <= 0 || valueDiff < 0) return false;

        TreeMap<Long, Long> map = new TreeMap<>();
        
        for (int i = 0; i < nums.length; i++) 
        {
            long num = (long) nums[i]; //num = 2
            
            Long floorKey = map.floorKey(num + valueDiff); // 2+0
            Long ceilingKey = map.ceilingKey(num - valueDiff); //2-0
           
            if ((floorKey != null && floorKey >= num - valueDiff) ||
                (ceilingKey != null && ceilingKey <= num + valueDiff)) 
            {
                return true;
            }
            map.put(num, (long) i); 
            if (i >= indexDiff)  //3 >= 3
            {
                map.remove((long) nums[i - indexDiff]); 
            }
        }
        return false;
    }
}

