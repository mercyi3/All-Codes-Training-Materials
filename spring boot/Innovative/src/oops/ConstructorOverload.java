package oops;

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
	ConstructorOverload(int a)
	{
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		new ConstructorOverload();
		new ConstructorOverload("Paremeterized");
		new ConstructorOverload(5);
	}
}
