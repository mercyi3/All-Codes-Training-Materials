package oops;

interface Example
{
	int b=5;
	void sum();
}

public class InterfaceClass implements InterfaceEx, Example
{
	public void print() 
	{
		System.out.println("Interface Method in class");
	}
	public void sum()
	{
		System.out.println("SUB: "+(a-b));
	}
	public static void main(String[] args) 
	{
		InterfaceClass  in = new InterfaceClass();
		in.print();
		in.print(5);
		in.sum();
	}

}
