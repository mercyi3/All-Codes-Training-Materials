package fileHandling;

import java.io.*; //all classes we can use
import java.util.Scanner;

public class ReadingFile 
{
	public static void main(String[] args) throws IOException 
	{
		File file = new File("file.txt");
		
//		file.mkdir(); //to create folder
		
//		file.delete();
		
		FileReader read = new FileReader(file);
		
		Scanner sc = new Scanner(read);
		while(sc.hasNextLine())
		{
//			System.out.println(sc.next()); //words
			System.out.println(sc.nextLine()); //line by line
		}	
	}
}
