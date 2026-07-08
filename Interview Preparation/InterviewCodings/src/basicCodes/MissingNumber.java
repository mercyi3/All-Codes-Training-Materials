package basicCodes;

public class MissingNumber 
{
	public static void main(String[] args) 
	{
        int[] nums = {3, 1, 5, 2, 7, 4}; 
        int missing = findMissingNumber(nums);
        System.out.println("The missing number is: " + missing);
    }
    public static int findMissingNumber(int[] nums) 
    {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2; // 6*(6+1)/2 = 21
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num; //22
        }
        return expectedSum - actualSum; //21-22 =-1
    }
}
