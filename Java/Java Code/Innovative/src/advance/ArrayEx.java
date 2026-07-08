package advance;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx 
{
	public static void main(String[] args) 
	{	
		int [] arr = {10,20,30};
		System.out.println(arr[0]); //10
		
		int[] array = new int[5];
		
		Scanner c = new Scanner(System.in);
		System.out.println("Enter 5 elements: ");
		for(int i=0; i<array.length; i++)
		{
			array[i] = c.nextInt();
		}
		
		System.out.println(Arrays.toString(array));	
	}
}
