package oops;

public interface InterfaceEx 
{
	int a=10; 
	
	void print() ;
	
	default void print(int b)
	{
		System.out.println("ADD: "+(a+b));
	}

}
