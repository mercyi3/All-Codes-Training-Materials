package Thread;

public class UsingThreadEx extends Thread {
	public void run() { //thread 
		for(int i=1;i<5;i++) { //2<5
			try {
				Thread.sleep(5000); //5 sec
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String[] arg) {
		UsingThreadEx op=new UsingThreadEx();
		UsingThreadEx ob=new UsingThreadEx();
		UsingThreadEx o=new UsingThreadEx();
		op.start(); //thread call - 1
		ob.start(); //thread call - 2
		o.start(); //thread call - 3	
	}
}