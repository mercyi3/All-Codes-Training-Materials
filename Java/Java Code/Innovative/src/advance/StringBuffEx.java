package advance;

public class StringBuffEx 
{
	public static void main(String[] args) 
	{
//		StringBuffer sb = new StringBuffer("Hello");
		
		StringBuilder sb = new StringBuilder("Hello");
		
		System.out.println(sb.length());
		
		sb.append(" World");
		System.out.println("Append: "+sb);
		
		System.out.println("Insert: "+ sb.insert(5, " Java"));

		System.out.println("Replace: "+ sb.replace(5, 10, " JAVA"));
		
		System.out.println("Delete: "+ sb.delete(5, 10));
		
		System.out.println("Reverse: "+ sb.reverse());
		
		System.out.println("Capasity: "+ sb.capacity());
		
		sb.ensureCapacity(60);
		System.out.println("After Ensure: "+ sb.capacity());
		
		System.out.println(sb);
	}

}
