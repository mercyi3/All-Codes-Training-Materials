package Basics;

import java.util.Scanner;

public class Branching {
public static void main(String[] args) 
{
	Scanner d = new Scanner(System.in);
	System.out.println("Enter 3 values: ");
	int a= d.nextInt(); //1000
	int b = d.nextInt();//500
	int c = d.nextInt();//5200
	
	if(a>b) //1000>500
	{
		if(a>c) //1000>5200
			System.out.println("A is Greater: "+a);
		else
			System.out.println("C is Greater: "+c);
	}
	else if(b>c) //500>520
		System.out.println("B is Greater: "+b);
	else
		System.out.println("C is Greater: "+c);
	}
}
