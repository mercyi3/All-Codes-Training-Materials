package advance;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx 
{
	public static void main(String[] args) 
	{	
		int [] arr = {10,20,30};
		System.out.println(arr[1]); //20
		
		int[] array = new int[5];
		
		Scanner c = new Scanner(System.in);
		System.out.println("Enter 5 elements: ");
		for(int i=0; i<array.length; i++) //6<5 
		{
			array[i] = c.nextInt(); //[1, 2, 3, 4, 5]
		}
		System.out.println(Arrays.toString(array));	
	}
}
