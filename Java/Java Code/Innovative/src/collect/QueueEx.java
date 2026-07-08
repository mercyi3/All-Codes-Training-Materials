package collect;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueEx 
{
	public static void main(String args[])
	{  
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		queue.add("Amit");  
		queue.add("Vijay");  
		queue.add("Karan");  
		queue.add("Jai");  
		queue.add("Rahul"); 
		
		System.out.println(queue);
		System.out.println("head:"+queue.element());  
		System.out.println("head:"+queue.peek());  
		
		queue.remove();  
		System.out.println(queue);
		
		queue.poll();  //deleting
		System.out.println(queue);

		System.out.println("iterating the queue elements:");  
		
		Iterator itr=queue.iterator();  
		while(itr.hasNext())
		{  
			System.out.println(itr.next());  
		}   
	}  
}
