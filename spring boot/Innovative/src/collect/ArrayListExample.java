package collect;

import java.util.ArrayList;

public class ArrayListExample 
{
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) 
	{
		ArrayList obj = new ArrayList();
		
		obj.add(5);
		obj.add("Apple");
		obj.add(null);
		obj.add(6.765);
		obj.add('d');
		obj.add(5);
		System.out.println("Obj1: "+obj);
		
		System.out.println("Banana is there? "+obj.contains("Banana"));
		
		System.out.println("Index 2: "+obj.get(2));
		
		ArrayList obj2 = (ArrayList) obj.clone();
		System.out.println("Obj2: "+obj2);
		
		System.out.println("Equal? "+obj.equals(obj2));
		
		System.out.println("Size : "+obj.size());
		
		System.out.println("Empty? "+obj.isEmpty());
		
		obj.clear();
		System.out.println(obj);
		System.out.println("Empty? "+obj.isEmpty());	
	}
}
