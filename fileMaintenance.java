/*
Stephen LaFrankie
Reads another file into an array and returns a key

*/

import java.util.*;
import java.io.*;

public class fileMaintenance
{
	public static void main(String[] args) throws FileNotFoundException
	{
		//read array from disk
		String fname = "myArr.java";
		int[]A = readFile(fname);
		setValues(A);

		//get search key from user
		Scanner key = new Scanner(System.in);
		System.out.print("Number to search: ");
			int choice = key.nextInt();
		if(search (A, choice))
			System.out.println("Found " +choice);
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
	static void setValues(int[] A)
	{
		//display elements of A
		for(int i = 0; i < A.length; i++)
		{
			System.out.print(A[i] + " ");
		}
		System.out.println();
	}
	static boolean search(int[] A, int key)
	{
		//searches 'A' for 'key', returns boolean
		for(int i = 0; i < A.length; i++)
		{
			if(A[i] == key)
			{
				return true;
			}
		}
		return false;
	}
}
/*
2/16/18
*/