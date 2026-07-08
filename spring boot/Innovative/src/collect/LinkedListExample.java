package collect;

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListExample 
{
	public static void main(String[] args) 
	{
		LinkedList<String> city = new LinkedList<String>();  
		 city.add("Delhi");  
		 city.add("Mumbai");  
		 city.add("Kolkata");  
		 city.add("Chandigarh"); 
		 city.add("Coimbatore");
		 city.add("Noida");  
	    
		 System.out.println(city);
		
		 System.out.println( city.contains("Delhi"));
		 System.out.println(city.hashCode());
		
		 city.remove("Kolkata");
		 System.out.println(city);
		
		 System.out.println(city.size());
		 
        // Iterator to iterate the cityNames  
        Iterator i = city.iterator();  
    
        System.out.println("CityNames elements:");  
    
        while (i.hasNext())  
            System.out.println(i.next());  
  	} 
}
