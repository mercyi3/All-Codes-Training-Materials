package collect;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetEx 
{
	public static void main(String[] args) 
	{
		SortedSet<String> sort = new TreeSet<String>();
		
		sort.add("Arnav");
		sort.add("Singh");
		sort.add("Khushi");
		
		System.out.println(sort);
		
		System.out.println("Head: "+sort.headSet("khushi"));
		System.out.println("Tail: "+sort.tailSet("Arnav"));	
	}
}
