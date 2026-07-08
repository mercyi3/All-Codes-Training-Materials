package Basics;

public class BitLogicalOp 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=5;  
		int c=20;  
		                  //10<5  15<20
		System.out.println(a<b & a++<c); //false
		System.out.println("a= "+a);//11
		System.out.println(a<b && a++<c);//false
		System.out.println("a= "+a);//11
		                  //10>5  11>20
		System.out.println(a>b | a++<c);
		System.out.println("a= "+a);
		System.out.println(a>b || a++<c);
		System.out.println("a= "+a);
	}
}
