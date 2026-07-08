package oops;

class FirstClass
{
	void print()
	{
		System.out.println("Parent Class");
	}
}
class Second extends FirstClass
{
	void print()
	{
		System.out.println("Child Class");
		super.print();
	}
}
public class OverridingEx 
{
	public static void main(String[] args) 
	{
		Second s = new Second();
		s.print();
//		s.print();
		
//		FirstClass f = new FirstClass();
//		f.print();	
	}
}
