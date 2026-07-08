package oops;

abstract class Mobile
{
	void callText()
	{
		System.out.println("Call & Text...");
	}
	
	void fingerPrint()
	{
		System.out.println("Finger Print Access...");
	}
	
	abstract void VirtualDisplay();
	abstract void invisiblePhone();
}

public class AbstractionEx 
{
	public static void main(String[] args) 
	{
		UpdatedMobile um = new UpdatedMobile();
		um.callText();
		um.fingerPrint();
		um.invisiblePhone();
		um.VirtualDisplay();
	}

}
