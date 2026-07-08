package Basics;

import java.util.Scanner;

public class DoWhileEx 
{
	public static void main(String[] args) 
	{
		Scanner d = new Scanner(System.in);
		System.out.println("1. Pizza \n2.Burger \n3.Momos");
		do 
		{
			System.out.println("Enter your option:");
			String option = d.next();
			
			System.out.println("Your "+option
					+ " will be delivered in 15 mins...");
			System.out.println("Anything else you want? (yes/no): ");
			String answer = d.next();
			if(answer.equals("yes"))
			{
				continue;
			}
			else {
				break;
			}
		}while(true);
	}
}
