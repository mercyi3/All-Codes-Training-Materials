package oops;

abstract class Mobile
{
	void callText() {
		System.out.println("Call & Text...");
	}
	void fingerPrint() {
		System.out.println("Finger Print Access...");
	}
	abstract void VirtualDisplay();
	abstract void invisiblePhone();
}
public class AbstractionEx extends UpdatedMobile
{
	public static void main(String[] args) 
	{
		AbstractionEx um = new AbstractionEx();
		um.callText();
		um.fingerPrint();
		um.invisiblePhone();
		um.VirtualDisplay();
	}
}