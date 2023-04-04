/*
	Reads file into array, searches
	file for a key.
	Stephen LaFrankie
	1/30/18
*/

import java.util.*;
import java.io.*;

public class Set
{
	public static void main(String[] args)throws FileNotFoundException
	{
		Scanner key = new Scanner(System.in);
		//Get the numbers from the file
		String numbers = "thisArr.java";
		int[] A = readFile(numbers);
		int[] B = new int[10];
		//System.out.println("Union between arrays is: " +union(A, B));

		System.out.println("Max is " +max(union(A,B)));
	}
	static int[] readFile(String name)throws FileNotFoundException
	{
		//read data from file "arr1.java" into array
		int n  = 10;
		int[] A = new int[n];
		//filereader with arg 'name' and scanner with arg 'reader' will read
		//and print contents of array found in 'myArr.java'
		FileReader reader = new FileReader(name);
		Scanner key = new Scanner(reader);
		for(int i = 0; i < n; i++)
		{
			A[i] = key.nextInt();
		}
		return A;
	}
	public static int[] union(int[] A, int[] B)
	//returns union of sets A and B
	{
	int[] y = new int[A.length + B.length];
	//y <- A
	for(int i = 0; i < A.length; i++)
		y[i] = A[i];
	for(int j = 0; j < B.length; j++)
		y[A.length+ j] = B[j];
	return y;

	}

	public static int max(int[] A)
	{
		int y = A[0];
		for(int i = 0; i < A.length; i++)
		{
			if(A[i] > y);
			{
				y = A[i];
			}
		}
		return y;
	}
}
/*
	public static int[] max2(int[] A, int first, int last)
	{
		if (first == last)
		{
			return A[1];
		}
		else
		{
			int z = max2(A[1], first+1, last);
			return (A[first] > z ? A[first] : z + " is the greatest");
		}
	}
}
*/