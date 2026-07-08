package advance;

public class StringBuffEx 
{
	public static void main(String[] args) 
	{
		//StringBuffer sb = new StringBuffer("Hello");
		StringBuilder sb = new StringBuilder("Hello");
		
		System.out.println(sb.length()); //5
		sb.append(" World");			   //012345678910
		System.out.println("Append: "+sb); //Hello World
		System.out.println("Insert: "+ sb.insert(5, " Java"));// Hello Java World
		System.out.println("Replace: "+ sb.replace(5, 10, " JAVA"));// Hello JAVA World
		System.out.println("Delete: "+ sb.delete(5, 10));// Hello World
		System.out.println("Reverse: "+ sb.reverse()); //dlrow olleH
		System.out.println("Capasity: "+ sb.capacity()); //22
		sb.ensureCapacity(60);
		System.out.println("After Ensure: "+ sb.capacity()); //60
		
		System.out.println(sb);
	}
}
