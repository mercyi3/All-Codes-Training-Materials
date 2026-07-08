package oops;

class First
{
	void print()
	{
		System.out.println("Parent Class");
	}
}
class Second extends First
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
		
//		First f = new First();
//		f.print();	
	}
}
