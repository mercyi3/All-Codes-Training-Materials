package collect;

import java.util.TreeMap;

public class TreeMapEx 
{
	public static void main(String[] args) 
	{
		TreeMap<Integer,String> tree = new TreeMap<Integer,String>();
		
		tree.put(1, "Zoro");
		tree.put(3, "Luffy");
		tree.put(4, "Sanji");
		tree.put(5, "Robin");
		tree.put(2, null);
		tree.put(6, null);
		System.out.println(tree);
		
		System.out.println(tree.containsKey(3)); 
		System.out.println(tree.containsValue("Nami"));
		System.out.println(tree.subMap(3, 6));
		
		System.out.println(tree.descendingKeySet());
		System.out.println(tree.descendingMap());
	}
}
