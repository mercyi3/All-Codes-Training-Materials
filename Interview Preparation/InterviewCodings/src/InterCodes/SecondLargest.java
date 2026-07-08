package InterCodes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Finding second largest number from an array using java 8 
public class SecondLargest 
{
	public static void main(String[] args) 
	{	
		List<Integer> list = Arrays.asList(19,23,43,34,25,56);
		
		 Integer secondLargest = list.stream().distinct()
				 				.sorted(Comparator.reverseOrder())
				 				.skip(1)
				 				.findFirst()
				 				.orElse(null);
		System.out.println("Second Largest Number is: "+ secondLargest);
	}
}

// Select salary from employees where salary = 
//( select max(salary) from employees where salary<
//( select max(salary) from employees));
