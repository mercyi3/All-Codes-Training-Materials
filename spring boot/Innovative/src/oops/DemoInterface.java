package oops;

public interface DemoInterface {
	
	int numbers =6;
	void add();
	default void printing()
	{
		System.out.println("Defualt Method");
	}
}
interface Demo2
{
	int a=5;
}
class Sum extends Demo implements DemoInterface, Demo2  
{
	void sum()
	{
		System.out.println(num+number);
	}
}
