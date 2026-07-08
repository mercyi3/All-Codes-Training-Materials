package Thread;

import java.util.Scanner;

public class ATMProject 
{
	Scanner sc = new Scanner(System.in);
	static int balance = 10000;
	synchronized void withdraw(int amount) throws InterruptedException 
	{
		if(amount > balance)
		{
			try {
				System.out.println("Your balance is too low please deposit first...");
				wait();
				System.out.println("Withdrawing the amount...");
				balance -= amount;
				System.out.println("WithDraw Succefull... \nYour Current balance is: "+balance);
			} 
			catch (InterruptedException e) 
			{	
				e.printStackTrace();
			}
		}
		else {
			System.out.println("Withdrawing the amount...");
			balance -= amount;
			System.out.println("WithDraw Succefull... \nYour Current balance is: "+balance);
		}	
	}
	
	synchronized void deposit() 
	{
		System.out.print("Enter money to be deposited:");  	                  	    
    	int deposit = sc.nextInt();  	    
    	balance = balance + deposit;  
    	System.out.println("Your Money has been successfully depsited");  
    	notify();  
	}

	synchronized void balance() 
	{
		System.out.println("Balance : "+balance);  
		
	}
	public static void main(String[] args) 
	{
		ATMProject atm = new ATMProject();
		Scanner s = new Scanner(System.in);
		
		System.out.println("1. Withdraw \n2. Deposit \n3. Balance");
		
		System.out.println("Enter your option: ");
		int op = s.nextInt();

		switch(op)
		{
			case 1:
				
				System.out.println("Enter amount to withdraw: ");
				int amount = s.nextInt();
				if(amount > balance)
				{
					new Thread()
					{
						public void run()
						{
							try {
								atm.withdraw(amount);
							} 
							catch (InterruptedException e) {
								
								e.printStackTrace();
							}
						}
					}.start();
					
					new Thread()
					{
						public void run()
						{
							atm.deposit();
						}
					}.start();
				
				}
				else 
				{
					
					new Thread()
					{
						public void run()
						{
							try {
									atm.withdraw(amount);
								} 
								catch (InterruptedException e) {
									e.printStackTrace();
								}
							}
					}.start();
				}
				break;
				
			case 2:
				new Thread()
				{
					public void run()
					{
						atm.deposit();
					}
				}.start();
				break;
		
			case 3:
				new Thread()
				{
					public void run()
					{
						atm.balance();
					}
				}.start();
				break;
				
			default:
				System.out.println("Invalid Option...");
		}
	}
}
