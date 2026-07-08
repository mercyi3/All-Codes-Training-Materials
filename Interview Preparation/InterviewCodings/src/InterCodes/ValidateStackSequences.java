package InterCodes;

import java.util.Stack;

public class ValidateStackSequences 
{	
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int j = 0;

        for (int num : pushed) 
        {
            stack.push(num); // 1 2 3 4 5
            while (!stack.isEmpty() && stack.peek() == popped[j]) //1==1
            {
                stack.pop();  // 4 5 3 2 1
                j++; //5
            }
        }
        return j == popped.length; // 5 == 5
    }
    public static void main(String[] args) {
        int[] pushed = {1, 2, 3, 4, 5};
        int[] popped = {4, 5, 3, 2, 1};
        boolean result = validateStackSequences(pushed, popped);
        System.out.println(result); // Output: true
    }
}
