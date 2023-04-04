/**************************************************
Stephen LaFrankie
10/12/2017
Output: To receive mesurements of shapes from the
user and calculate the areas in a Geometry class
**************************************************/
import java.util.Scanner;
public class testAS7sl
{
	public static void main(String[] args)
	{

		Scanner key = new Scanner(System.in);
		//acquires user input
		System.out.println("To use the calculator:");
		System.out.println("Enter 1 to calculate the area of a circle.");
		System.out.println("Enter 2 to calculate the area of a rectangle.");
		System.out.println("Enter 3 to calculate the area of a triangle.");
		System.out.println("Enter 4 to quit.");
		System.out.print("Selection: ");

		int selection = key.nextInt();

		switch(selection){
		case 1:
			System.out.print("Enter radius: ");
				double radius = key.nextDouble();
			if(radius < 0){
			System.out.println("Please try again with a positive value for the radius");
			}
			else
			System.out.println("Area is " +AS7sl.getCirArea(radius));
				break;

		case 2:
			System.out.println("Enter Length: ");
				double length = key.nextDouble();
			System.out.println("Enter width: ");
				double width = key.nextDouble();
			if(length < 0 || width < 0){
				System.out.println("Please try again with positive values for lenth and width");
				}
			else
			System.out.println("Area is " +AS7sl.getRecArea(length, width));
				break;

		case 3:
			System.out.println("Enter Base: ");
				double base = key.nextDouble();
			System.out.println("Enter Height: ");
				double height = key.nextDouble();
			if(base < 0 || height < 0){
				System.out.println("Please try again with positive values for base and height");
			}
			else
			System.out.println("Area is " +AS7sl.getTriArea(base, height));
			break;

		default:
			System.out.println("Goodbye");
		}
	}
}