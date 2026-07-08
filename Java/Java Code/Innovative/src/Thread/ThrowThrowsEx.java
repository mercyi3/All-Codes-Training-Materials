package Thread;

public class ThrowThrowsEx 
{

	static void func() throws Exception 
	{
		int a[] = {1,2,3,4,5};
		System.out.println(a[4]); 
		
		throw new ArithmeticException("\nUser Defined Exception");
	}
	
	public static void main(String[] args) 
	{
		try {
			func();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println("Hello");
	}
}
