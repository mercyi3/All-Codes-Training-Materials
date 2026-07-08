package collect;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigatableMapEx {

	public static void main(String[] args) 
	{
		NavigableMap<Integer, String> map = new TreeMap<Integer, String>();
		
		map.put(1, "Hello");
		map.put(3, null);
		map.put(2, "Luffy");
		map.put(4, "Morning");
		map.put(5, "Moon");
		map.put(6, "Sun");
		
		System.out.println(map);
		
		map.tailMap(2); //
		System.out.println(map);
		
//		map.headMap(6, true);
		System.out.println(map.headMap(6, true));
		
		map.remove(3);
		System.out.println(map);
		
	}

}
