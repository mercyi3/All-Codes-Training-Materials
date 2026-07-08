package Basics;

import java.util.Scanner;

public class Loops 
{
	public static void main(String[] args) 
	{
		// factorial program num=5 5*4*3*2*1 =120
		long fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No: ");
		int a=sc.nextInt();//5
		
		for(int i=1;i<=a;i++) //6<=5
		{
			fact *= i; // 24*5= 120(fact)
			System.out.print(i+"*"); //1*2*3*4*5*
		}
		System.out.println("\nFactorial ="+fact); // 120
	}
}
