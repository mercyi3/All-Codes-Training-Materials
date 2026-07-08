package Thread;

public class UsingRunnable implements Runnable {
	public void run() //thread
	{
		System.out.println("Thread is Running...");
	}
	void run(String s) //normal function
	{
		System.out.println(s+" Function");
	}
	public static void main(String[] args) 
	{
		UsingRunnable ur = new UsingRunnable();
		
		Thread t1 = new Thread(ur);
		Thread t2 = new Thread(ur);
		
		ur.run("Normal"); //normal function call
		t1.start(); //thread call
		t2.start(); //2 thread call
		t1.run(); //function call
	}
}
