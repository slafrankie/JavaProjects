//Stephen LaFrankie
//10-20-17
/*
	Purpose: User sets array size, the array
	is passed to the calculate method where
	it is assigned members. The for loop then
	calculates the total sales price of the items
*/
import java.util.Scanner;
public class debugged
{
	public static void main(String[] args)
	{
		int n;

		Scanner key = new Scanner(System.in);

		System.out.print("Enter number of items: ");
			n = key.nextInt();

		Double num[] = new Double[n];
		calculate(num);

	}


		public static void calculate(Double num[])//Receives array as parameter and calculates each input
			{
				double salesTax = .05;
				double salesPrice;
				int i;

				Scanner key = new Scanner(System.in);

				for(i = 0; i <= num.length-1; i++)//set i variable to 0 and num.length(-1)
				{
					System.out.printf("Enter price of item %d: %n", i+1);
							num[i] = key.nextDouble();

					salesPrice = num[i] + (num[i] * salesTax);
					System.out.println();
					System.out.printf("Price of item %d including tax: $%.2f%n",i+1,salesPrice);
					System.out.println();
				}



	}

}
