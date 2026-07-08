package Basics;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) 
	{
		int i=5; //static
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter All types of data:");

		String str1 = s.nextLine(); //dynamic
		int a= s.nextInt(); //6
		long l = s.nextLong();
		float f= s.nextFloat();
		double d = s.nextDouble();
		String str = s.next(); //one word
		
		s.nextLine();// more than lines im taking
		String str2 = s.nextLine(); //more than 1 word
		
		System.out.println("a= "+a);
		System.out.println("l= "+l);
		System.out.println("f= "+f);
		System.out.println("d= "+d);
		System.out.println("str= "+str);
		System.out.println("str2= "+str2+"\nstr1 = "+str1);
		
		s.close();
	}
}
