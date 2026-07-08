package oops;

class GrandPa
{
	void property()
	{
		System.out.println("House");
	}
}
class Dad extends GrandPa
{
	void property2()
	{
		System.out.println("Company");
	}
}
class Son extends Dad
{
	void property3()
	{
		System.out.println("Car");
	}
}
public class MultiLeveInherit 
{
	public static void main(String[] args) 
	{
		Son c = new Son();
		c.property();
		c.property2();
		c.property3();
	}
}
