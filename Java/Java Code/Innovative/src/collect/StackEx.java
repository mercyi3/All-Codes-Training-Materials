package collect;

import java.util.Stack;
import java.util.Vector;

public class StackEx {

	public static void main(String[] args) 
	{
		Stack<String> obj = new Stack<String>();
//		Vector<String> obj = new Vector<String>();
		
		obj.add("hi");
		obj.add("I");
		obj.add("am");
		obj.push("Robin");
		
		System.out.println(obj);
		
		String name = obj.pop();
		System.out.println(name);
		
		System.out.println(obj);
	}
}
