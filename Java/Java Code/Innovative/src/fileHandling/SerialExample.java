package fileHandling;

import java.io.*;

@SuppressWarnings("serial")
class Student implements Serializable
{  
	 int id;  
	 String name;  	
	 Student(int id, String name) 
	 {  
		  this.id = id;  //101
		  this.name = name;  //Robin
	 }  
}
public class SerialExample
{    
	 public static void main(String args[])
	 {    
		  try
		  {     
			  Student s =new Student(101,"Robin");    
		     
			  FileOutputStream f=new FileOutputStream("data.txt");    
			  ObjectOutputStream o=new ObjectOutputStream(f);    
			  o.writeObject(s); 
			  o.writeObject(" Stored");
			  o.flush();    
			  o.close();    
			  System.out.println("success");    
		  }
		  catch(Exception e)
		  {
			  System.out.println(e);
		  }  
	 }    
}    
