package Basics;

public class ConditionalOp {

	public static void main(String[] args) 
	{
		int a=100, b=15;
		
		int Max = (a>b)?a:b;
		System.out.println("Maximun: "+Max);
		
		int Min = (a<b)?a:b;
		System.out.println("Minimun: "+Min);
		
		boolean ans = (a>b)?true:false;
		System.out.println("Answer: "+ans);
	}

}
