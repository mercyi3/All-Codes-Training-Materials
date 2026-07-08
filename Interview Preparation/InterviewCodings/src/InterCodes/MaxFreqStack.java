package InterCodes;

import java.util.*;

class FreqStack 
{
    private Map<Integer, Integer> frequencyMap;
    private List<Stack<Integer>> frequencyStack;
    private int maxFrequency;
    public FreqStack() 
    {
        frequencyMap = new HashMap<>();
        frequencyStack = new ArrayList<>();
        maxFrequency = 0;
    }
    public void push(int val) 
    {
        int freq = frequencyMap.getOrDefault(val, 0) + 1;
        frequencyMap.put(val, freq); 
        if (freq > maxFrequency) 
        {
            maxFrequency = freq; 
            frequencyStack.add(new Stack<>()); 
        }
        frequencyStack.get(freq - 1).push(val); 
    }
    public int pop() 
    {
    	System.out.println("mf : "+maxFrequency);
        Stack<Integer> stack = frequencyStack.get(maxFrequency - 1);
        int val = stack.pop();
        System.out.println(val);
        frequencyMap.put(val, frequencyMap.get(val) - 1);
        if (stack.isEmpty()) 
        {
            frequencyStack.remove(maxFrequency - 1);
            maxFrequency--;
        }
        return val;
    }
}
public class MaxFreqStack 
{
    public static void main(String[] args) 
    {
        FreqStack freqStack = new FreqStack();
        freqStack.push(5);
        freqStack.push(7);
        freqStack.push(5);
        freqStack.push(7);
        freqStack.push(4);
        freqStack.push(5);

        System.out.println(freqStack.pop()); // Output: 5
        System.out.println(freqStack.pop()); // Output: 7
        System.out.println(freqStack.pop()); // Output: 5
        System.out.println(freqStack.pop()); // Output: 4
    }
}

