package advance;

import java.util.Scanner;

public class Array2DEx 
{
	static void threeD()
	{
		//3D array
		int arr2[][][] = new int[2][2][3]; // 2 box 2 row 3 column
		
		Scanner w = new Scanner(System.in);
		System.out.println("Enter 12 elements: ");
		for(int i=0; i<2; i++) //box 2
		{
			for(int j=0; j<2; j++) // row 2
			{
				for(int k=0; k<3; k++) // column 3
				{
					arr2[i][j][k] = w.nextInt();
				}
			}
		}
		System.out.println("3D Array was: ");
		for(int i=0; i<2; i++) //box 2
		{
			for(int j=0; j<2; j++) // row 2
			{
				for(int k=0; k<3; k++) // column 3
				{
					System.out.print(arr2[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
	
	static void twoD()
	{
		//2D array
		int arr2[][] = new int[2][3]; //2 row 3 column
		
		Scanner w = new Scanner(System.in);
		System.out.println("Enter 6 elements: ");
		for(int i=0; i<2; i++) //row 2
		{
			for(int j=0; j<3; j++) // column 3
			{
					arr2[i][j] = w.nextInt();
			}
		}
		
		//System.out.println(Arrays.toString(arr2));
		
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
	
	public static void main(String[] args) 
	{	
		threeD();
	}
}
