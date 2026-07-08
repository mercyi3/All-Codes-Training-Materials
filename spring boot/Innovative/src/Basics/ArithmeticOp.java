package Basics;

public class ArithmeticOp {

	public static void main(String[] args) 
	{
		int a=10, b=20;
		a+=b;
		System.out.println("Addition: "+a);//a=30
		
		b-=a; //b = b-a 20-30
		System.out.println("Subtraction: "+b);//b= -10
		
		System.out.println("Multiply: "+(a*=b));// 30*-10
		System.out.println("Division: "+(a/=b));// -300/-10
		System.out.println("Modulus: "+(b%=a));// -10%30
	}
}
