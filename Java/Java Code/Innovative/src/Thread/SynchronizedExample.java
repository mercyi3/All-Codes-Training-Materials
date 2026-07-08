package Thread;

public class SynchronizedExample 
{
	int a=8, b=6;
	synchronized void add() throws InterruptedException
	{
		int c = a+b;
		System.out.println("Waiting...");
		wait();
		System.out.println("Notified...");
		System.out.println("Addition: "+c);
	}
	
	synchronized void sub()
	{
		System.out.println("Subtract: "+(a-b));
		notify();
	}

	public static void main(String[] args) 
	{
		SynchronizedExample s = new SynchronizedExample();
		
		new Thread()
		{
			public void run()
			{
				try {
					s.add();
				} 
				catch (InterruptedException e) 
				{	
					e.printStackTrace();
				}
			}
		}.start();
		
		new Thread()
		{
			public void run()
			{
				s.sub();
			}
		}.start();
	}

}
