package networking;

import java.io.DataOutputStream;
import java.net.Socket;

public class ClientCode 
{
	public static void main(String[] args) 
	{
		try
		{						//127.0.0.1
			Socket s=new Socket("localhost",6666);
			DataOutputStream d=new DataOutputStream(s.getOutputStream());
			d.writeUTF("Raavan");
			d.flush();
			d.close();
			s.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
