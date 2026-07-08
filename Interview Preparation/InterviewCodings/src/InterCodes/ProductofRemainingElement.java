package InterCodes;

import java.util.Arrays;

public class ProductofRemainingElement 
{
	// creating subarray of other products of elements in a array.
	public static void main(String[] args) 
	{
		int[] nums = {1, 2, 3, 4};
		int subArray[] = new int[4];
		int product =1;
		
		for(int i=0; i< nums.length; i++)
		{
			product *= nums[i]; //24	
		}
		for(int i=0; i< nums.length; i++)
		{
			subArray[i] = product / nums[i];
		}
		System.out.println(Arrays.toString(subArray));
			
	}
}
