package fileHandling;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserialExample 
{
	public static void main(String[] args)
	{
		try
		{  
//			FileInputStream file = new FileInputStream("data.txt");
//			ObjectInputStream i= new ObjectInputStream(file); //instead
		  ObjectInputStream i= new ObjectInputStream(new FileInputStream("data.txt"));  
		  Student s=(Student)i.readObject();  
  
		  System.out.println(s.id+" "+s.name);  
		
		  i.close();  
		}
		catch(Exception e)
		{
			System.out.println(e);
		}  
	}
}
