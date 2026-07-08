package Basics;

public class Loops2 
{
	public static void main(String[] args) 
	{
		int i=1; //initializer
		while(i<=10) //11<=10 condition
		{
			if(i==6)//7==6
			{
				i++; //7
				continue;
			}
			System.out.println(i+" : Good Evening!");
			i++; //10
		}
	}
}
