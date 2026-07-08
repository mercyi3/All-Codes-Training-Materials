package networking;

import java.io.*;
import java.net.Socket;

public class BufferClient 
{
	public static void main(String[] args) throws IOException 
	{
		Socket s=new Socket("localhost",2000);
		DataInputStream din=new DataInputStream(s.getInputStream());
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String send="",recieve="";
		while(!send.equals("stop"))
		{
			send=br.readLine();
			dout.writeUTF(send);
			dout.flush();
			recieve=din.readUTF();
			System.out.println("Server says: "+recieve);
		}
		dout.close();
		s.close();
	}
}
