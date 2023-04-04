//Stephen LaFrankie
//10-20-17
import java.util.Scanner;
public class bugged
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


		public static void calculate(Double num[])
			{
				double salesTax = .05;
				double salesPrice;
				int i;

				Scanner key = new Scanner(System.in);

				for(i = 1; i <= num.length; i++)
				{
					System.out.printf("Enter price of item %d: %n", i);
							num[i] = key.nextDouble();

					salesPrice = num[i] + (num[i] * salesTax);
					System.out.println();
					System.out.printf("Price of item %d including tax: $%.2f%n",i,salesPrice);
					System.out.println();
				}



	}

}


