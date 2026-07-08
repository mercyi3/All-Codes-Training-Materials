package InterCodes;

import java.util.Stack;

public class MonotonicStack 
{
    private Stack<Integer> stack;
    public MonotonicStack() {
        stack = new Stack<>();
    }
    public void push(int value) {
        if (stack.isEmpty() || value >= stack.peek()) 
        {
            stack.push(value);
        } else {
            System.out.println("Cannot push " + value + ": it does not maintain monotonic property.");
        }
    }
    public Integer pop() {
        if (!stack.isEmpty()) {
            return stack.pop();
        } else {
            System.out.println("Stack is empty.");
            return null;
        }
    }
    public Integer peek() {
        if (!stack.isEmpty()) {
            return stack.peek();
        } else {
            System.out.println("Stack is empty.");
            return null;
        }
    }
    public void printStack() {
        System.out.println("Current stack: " + stack);
    }
    public static void main(String[] args) 
    {
        MonotonicStack monotonicStack = new MonotonicStack();
        monotonicStack.push(1);
        monotonicStack.push(2);
        monotonicStack.push(2); // Allowed
        monotonicStack.push(3);
        monotonicStack.push(1); // Not allowed
        monotonicStack.printStack();
        System.out.println("Popped: " + monotonicStack.pop());
        monotonicStack.printStack();
        System.out.println("Top element: " + monotonicStack.peek());
    }
}
