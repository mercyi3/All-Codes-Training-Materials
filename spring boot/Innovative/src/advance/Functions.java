package advance;

import java.util.Scanner;

public class Functions 
{
	int add(int a, int b) //with arg & return
	{
		return a+b; //5+8=13
	}
	int sub() //without arg & with return
	{
		int a=10,b=5; //local var
		return a-b; //10-5=5
	}
	void mul() //without arg & return
	{
		int a=10,b=5;
		System.out.println("Multiplication ="+(a*b));
	}
	void div(int a, int b) //with arg & without return
	{
		System.out.println("Divition ="+(a/b));
	}
	void mod(int a, int b) //with arg & without return
	{
		System.out.println("Modulation ="+(a%b));
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Value:");
		int a=sc.nextInt();
		System.out.println("Enter 2nd Value:");
		int b=sc.nextInt();
		
		Functions obj=new Functions();
		int sum = obj.add(a, b); //13
		System.out.println("Adding ="+ sum);
		System.out.println("Subtraction ="+(obj.sub()));
		obj.mul();
		obj.div(a, b);
		obj.mod(a, b);
		
		obj.mod(5, 2); //1
		obj.div(25, 6);//25/6=4
		
		sc.close();
	}
}
