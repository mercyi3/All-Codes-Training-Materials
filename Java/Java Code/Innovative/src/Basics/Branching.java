	package Basics;

import java.util.Scanner;

public class Branching {

	public static void main(String[] args) 
	{
		Scanner d = new Scanner(System.in);
		System.out.println("Enter 3 values: ");
		int a= d.nextInt(); //100
		int b = d.nextInt();//50
		int c = d.nextInt();//200
		
		if(a>b) //100>50
		{
			if(a>c) //100>200
				System.out.println("A is Greater: "+a);
			else
				System.out.println("C is Greater: "+c);
		}
		else if(b>c)//50>200
			System.out.println("B is Greater: "+b);
		else
			System.out.

					println("C is Greater: "+c);
		
	}
}
