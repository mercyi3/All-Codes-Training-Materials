package Thread;

import java.util.Scanner;

public class ATM 
{
	Scanner sc = new Scanner(System.in);
	int balance = 10000;
	synchronized void withdraw() throws InterruptedException
	{
		System.out.println("Enter amount to withdraw: ");
		int amount = sc.nextInt();
		if(amount > balance)
		{
			System.out.println("Your balance is too low please deposit first...");
			wait();
			System.out.println("Withdrawing the amount...");
			balance -= amount;
			System.out.println("WithDraw Succefull... \nYour Current balance is: "+balance);
		}
		else {
			System.out.println("Withdrawing the amount...");
			balance -= amount;
			System.out.println("WithDraw Succefull... \nYour Current balance is: "+balance);
		}	
	}
	
	synchronized void deposite()
	{
		System.out.print("Enter money to be deposited:");  	                  	    
    	int deposit = sc.nextInt();  	    
    	balance = balance + deposit;  
    	System.out.println("Your Money has been successfully depsited");  
    	notify(); 
	}

	public static void main(String[] args) 
	{
		ATM atm = new ATM();
		
		new Thread()
		{
			public void run()
			{
				try {
					atm.withdraw();
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
				atm.deposite();
			}
		}.start();
	}
}
