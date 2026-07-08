package Basics;

import java.util.Scanner;

public class SwitchCase 
{

	public static void main(String[] args) 
	{
		System.out.println("a. Pizza \nb.Burger \nc.Momos");
		Scanner d = new Scanner(System.in);
		
		do {
			
			System.out.println("Enter your option:");
			String option = d.next();
			
			switch(option) //b
			{
				case "a":
					System.out.println("Pizza - 250Rs");
					break;
				case "b":
					System.out.println("Burger - 150Rs");
					break;
				case "c":
					System.out.println("Momos - 50Rs");
					break;
				default:
					System.out.println("Sorry!! we don't have that...");
			}
			
			System.out.println("Anything else? (yes/no) :");
			String answer = d.next();
			
			if(answer.equals("yes"))
				continue;
			else
				break;
		}while(true);
		
	}
}
