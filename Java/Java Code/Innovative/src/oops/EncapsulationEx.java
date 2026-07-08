package oops;

import java.util.Scanner;

class PrivateDatas
{
	private String username;
	private String password;
	
//	public String getUsername() {
//		return username;
//	}
//	public void setUsername(String username) {
//		this.username = username;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
	
	
	
	public void setValue(String user, String password)
	{
		username = user;
		this.password = password;
	}

	public String getUsername()
	{
		return username;
	}
	
	public String getpassword()
	{
		return password;
	}
}
public class EncapsulationEx 
{
	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter Username: ");
		String user = sc.nextLine();
		System.out.println("Enter Password: ");
		String password = sc.next();
		
		PrivateDatas capsule = new PrivateDatas();
		capsule.setValue(user, password);
		
		System.out.println("Username : "+capsule.getUsername());
		System.out.println("Password : "+capsule.getpassword());
	}
}
