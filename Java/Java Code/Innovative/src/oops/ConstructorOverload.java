package oops;

class Demo
{
	Demo() //constructor
	{
		System.out.println("Demo Constructor");
	}
	
	Demo(int i) //parameterized constructor
	{
		System.out.println("Demo Constructor"+i);
	}
}

public class ConstructorOverload 
{
	ConstructorOverload() //constructor
	{
		System.out.println("Default Constructor");
	}
	
	ConstructorOverload(String str) //constructor
	{
		System.out.println(str+" Constructor");
	}

	public static void main(String[] args) 
	{
		new ConstructorOverload();
		new ConstructorOverload("Paremeterized");
		
		new Demo();
		new Demo(2);
	}
}
