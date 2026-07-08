package oops;

public class MethodOverload 
{
	static int a = 10, b = 15;
	static void sum()
	{
		System.out.println("Add: "+(a+b));
	}
	
	static void sum(int a, int b)
	{
		System.out.println("Sub: "+(a-b));
	}
	
	static void sum(int a)
	{
		System.out.println("Mul: "+(a*b));
	}
	
	static void sum(float a)
	{
		System.out.println("Div: "+(a/b));
	}
	public static void main(String[] args) 
	{
		sum();
		sum(15, 5);
		sum(300);
		sum(22.8f);
	}
}
