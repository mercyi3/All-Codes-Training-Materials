package collect;

import java.util.TreeSet;

public class TreeSetExample 
{
	public static void main(String[] args) 
	{
		TreeSet<Double> tree = new TreeSet<Double>();
		tree.add(2.56);
		tree.add(6.76);
		tree.add(56.67);
		tree.add(3.14);
		tree.add(8.90);
		System.out.println(tree);
		
		System.out.println(tree.ceiling(3.14));
		System.out.println(tree.ceiling(7.77));
		
		System.out.println("head node: "+tree.first());
		System.out.println("higher than 5.6 is: "+tree.higher(5.6));
		System.out.println("tail node: "+tree.last());
		
		for(double d : tree.descendingSet()) //enhanced for loop
		{
			System.out.println(d);
		}
		
		System.out.println(tree.descendingSet());
	}
}
