package Thread;

public class DaemonThreadEx extends Thread
{
	public void run() 
	{
		if(Thread.currentThread().isDaemon()) {
			System.out.println(Thread.currentThread().getName()
					+" is Deamon Thread");
		}
		else {
			System.out.println(Thread.currentThread().getName()
					+" is Normal Thread");
		}
	}
	public static void main(String[] args) 
	{
		DaemonThreadEx d1 = new DaemonThreadEx();
		DaemonThreadEx d2 = new DaemonThreadEx();
		
		d1.setDaemon(true);
		d1.setName("D1");
		d2.setName("D2");	
		
		d1.start(); //THREAD-0 == D1
		d2.start(); //thread-1 == D2
	}

}
