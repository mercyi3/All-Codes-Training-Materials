package collect;

import java.util.HashSet;

public class HashSetEx {
	public static void main(String[] args) 
	{
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(56); //hashing data %4&;.
		set.add(21);
		set.add(67);
		set.add(55);
		set.add(55);
		System.out.println(set);
		
		HashSet set2 = (HashSet<Integer>) set.clone();
		System.out.println(set2);
		
		System.out.println(set.containsAll(set2));
		
		set.remove(21);
		System.out.println(set);	
	}
}