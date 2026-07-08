package oops;

class Innovative //parent
{
	void branches()
	{
		System.out.println("Branches are...");
	}
}
//child 1
class Bangalore extends Innovative
{
	void branch1()
	{
		System.out.println("Bangalore Branch");
	}
}
//child 2
class Hyderabad extends Innovative
{
	void branch2()
	{
		System.out.println("Hyderabad Branch");
	}
}

public class HeirarchyInherit 
{
	public static void main(String[] args) 
	{
		Bangalore b = new Bangalore();
		b.branches();
		b.branch1();
		
		Hyderabad h = new Hyderabad();
//		h.branches();
		h.branch2();
	}
}
