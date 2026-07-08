package Thread;

public class TryCatchEx 
{
	static void sum()
	{
		int a=19;
		int c = a/0; //error
		System.out.println(c);
	}
	
	static void print()
	{
		System.out.println("After Exception");
	}

	public static void main(String[] args) 
	{
		try {
			sum();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			System.out.println("Finally Block");
		}
		
		print();
	}

}
