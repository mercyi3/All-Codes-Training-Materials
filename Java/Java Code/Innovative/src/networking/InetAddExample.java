package networking;

import java.net.*;

public class InetAddExample 
{
	public static void main(String[] args) 
	{	
		try 
		{
			InetAddress ip = InetAddress.getLocalHost();
//			InetAddress ip = InetAddress.getByName("www.google.com");
			System.out.println("Host Name:"+ip.getHostName());
			System.out.println("Host Address:"+ip.getHostAddress());
			System.out.println(ip.getAddress()+" "+ip.isMCGlobal());
			
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}	
	}
}
