package Basics;

import java.util.Scanner;

public class Loops 
{
	public static void main(String[] args) 
	{
		int fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No: ");
		int a=sc.nextInt();//5
		
		for(int i=1;i<=a;i++)
		{
			fact *= i; //24*5=120
			System.out.print(i+"*");
		}
		System.out.println("\nFactorial ="+fact);
	}
}
