package Basics;

import java.util.Scanner;

public class Divisibility {

	public static void main(String[] args) {
		// number is divisible by 3, 5, 7
		
		Scanner f = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = f.nextInt();
		
		if(num%3 == 0)
		{
			if((num%5 ==0))
			{
				if(num%7 ==0)
					System.out.println(num +" is divsible by 3,5,7");
				else
					System.out.println(num +" is divsible by 3,5 not by 7");
			}	
			else if(num%7==0)
				System.out.println(num +" is divsible by 3, 7 not by 5");
			else
				System.out.println(num +" is divsible by 3 not by 5,7");
		}
		else if(num % 5 ==0) {
			if(num%7==0)
				System.out.println(num +" is divsible by 5,7 not by 3");
			else
				System.out.println(num +" is divsible by 5 not by 3,7");
		}
		else if(num%7==0)
			System.out.println(num +" is divsible by 7 not by 3,5");
		else
			System.out.println(num +" is not divsible by 3,5,7");
	}
}
