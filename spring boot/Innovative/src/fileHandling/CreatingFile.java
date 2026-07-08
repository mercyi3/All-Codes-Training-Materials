package fileHandling;

import java.io.*;
import java.util.Scanner;

public class CreatingFile 
{
	public static void main(String[] args) throws IOException 
	{
		File f = new File("C:\\Roshni Trainer\\Java\\demo.txt");
		//f.createNewFile();
		
		if(f.exists()) {
			System.out.println("File is Already Created");
		}
		else {
			f.createNewFile();
			System.out.println("File is created");
		}
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String sentence = sc.nextLine();
		
		FileWriter fw = new FileWriter(f);
		fw.write("Hello Java "); //static input
		fw.append(sentence); //dynamic input
		
		fw.flush();
		fw.close();
	}
}
