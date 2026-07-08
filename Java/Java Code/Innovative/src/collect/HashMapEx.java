package collect;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapEx 
{
	public static void main(String[] args) 
	{
	   HashMap<Integer,String> map=new HashMap<Integer,String>();
	   map.put(1,"Mango");   
	   map.put(2,"Apple");    
	   map.put(3,"Banana");   
	   map.put(5,"Grapes");
	   map.put(null, null);
	   map.put(4, null);	   
	   
	   System.out.println(map);
	   map.remove(4);  
	   
	   System.out.println("Iterating Hashmap..."); 
	   
	   for(Entry<Integer, String> m : map.entrySet()) //enhanced for loop
	   {    
	    System.out.println(m.getKey()+" "+m.getValue());   
	   }
	   
	   System.out.println("\nReplacing one....");
	   map.replace(1, "Mango", "Grapes");  
	   for(Entry<Integer, String> m : map.entrySet())
	   {    
	    System.out.println(m.getKey()+" "+m.getValue());   
	   }
	    
	   System.out.println("\nUpdated list of elements:");  
	    map.replaceAll((k,v) -> "Apple");  
	     for(Entry<Integer, String> m : map.entrySet())
		 {    
		    System.out.println(m.getKey()+" "+m.getValue());  
	     }  
	}
}
