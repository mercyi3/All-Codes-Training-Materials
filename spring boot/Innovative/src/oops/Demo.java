package oops;

public class Demo implements DemoInterface
{
	int num = 9;
	public static final int number = 9;
	
	public void add()
	{
		System.out.println("Interface method");
	}
	public static void main(String [] a)
	{
		Demo d = new Demo();
		d.add();
		d.printing();
	}
}