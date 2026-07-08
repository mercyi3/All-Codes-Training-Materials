package networking;

import java.io.*;
import java.net.*;

public class BufferServer 
{
	public static void main(String[] args) throws IOException 
	{
		ServerSocket ss = new ServerSocket(2000);    
	    Socket s = ss.accept();    
	    DataInputStream din = new DataInputStream (s.getInputStream ());
	    DataOutputStream dout = new DataOutputStream (s.getOutputStream ());
	    BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	    String sended = "", recieved = "";
	    while (!sended.equals ("stop"))  
		{
	    	recieved = din.readUTF();
		    System.out.println ("client says:" + recieved); 
		    sended = br.readLine (); 
		    dout.writeUTF(sended); 
		    dout.flush();
	     }
		din.close ();
		s.close ();
		ss.close ();
	}
}
