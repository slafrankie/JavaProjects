import java.util.Scanner;
public class Sort
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		int n;

		System.out.print("How many numbers? ");
			n = key.nextInt();

		double[] hello = new double[n];


		for(int x = 0; x < hello.length; x++)
		{
			System.out.println("Enter integer: ");
				hello[x] = key.nextDouble();
		}
		System.out.println("Unsorted values: ");
		for(int x = 0; x<hello.length; x++)
		{
			System.out.println(hello[x]);
		}

		sortAscending(hello);
		System.out.println("What number are you looking for?: ");
		double num = key.nextDouble();
		searchNum(hello, num);
	}

   public static void sortAscending(double[] array)
   {
      int startScan, index, minIndex;
      double minValue;

	  int n = array.length;
      for (startScan = 0; startScan < (n-1); startScan++)
      {
         minIndex = startScan;
         minValue = array[startScan];


         for(index = startScan + 1; index < n; index++)
         {
            if (array[index] < minValue)
            {
			   minValue = array[index];
               minIndex = index;
            }
         }
         array[minIndex] = array[startScan];
         array[startScan] = minValue;
      }
      System.out.println("Sorted values:");
      for(int x = 0; x < n; x++)
      {
		  System.out.println(array[x]);
	  }
  }
  public static void searchNum(double[] array, double i)
  {
	  int first = 0;
	  int middle;
	  int last = array.length - 1;
	  int position = 1;
	  boolean found = false;
	  	while(!found && first < array.length)
	  	{
			middle = (first + last) / 2;
			if(array[middle]==i)
			{
				found = true;
				position = middle;
			}
			else if(array[middle]>i)
			{
				last = middle - 1;
			}
			else
			{
				first = middle + 1;
			}
			System.out.println(i +" is found in array at element "+ position);
		}
  }


}