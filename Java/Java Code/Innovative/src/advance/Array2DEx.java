package advance;

import java.util.Scanner;

public class Array2DEx 
{
	public static void main(String[] args) 
	{	//2D array
		int arr2[][] = new int[2][3];
		
		Scanner w = new Scanner(System.in);
		System.out.println("Enter 6 elements: ");
		for(int i=0; i<2; i++) //row 2
		{
			for(int j=0; j<3; j++) // column 3
			{
					arr2[i][j] = w.nextInt();
			}
		}
		
//		System.out.println(Arrays.toString(arr2));
		
		System.out.println("2D Array was: ");
		for(int i=0; i<2; i++) //row 2
		{
			for(int j=0; j<3; j++) // column 3
			{
					System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
	}

}
