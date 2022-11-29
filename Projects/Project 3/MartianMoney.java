/****************************************************************************
* MartianHouses
*****************************************************************************
* Project description
* The program determines the total surface area and the cost of the house
* Kyle Vinod
* 9/30/2021
* CMSC 255 004
****************************************************************************/



import java.util.Scanner;

public class MartianHouses
{
	public static void main(String [] args)
	{
		/****************************************************************************
		* Scanner implemented
		****************************************************************************/
		Scanner input = new Scanner(System.in);
		String answer = "yes";
		/****************************************************************************
		* While loop to determine settlers name, length of house side, surface area, and house cost
		****************************************************************************/
		while (answer.equals("yes")) {
			/****************************************************************************
			* Determines settler's name
			****************************************************************************/
			System.out.println("Enter the settlers name: ");
			String name = input.nextLine();
			/****************************************************************************
			* Determines the length of the house side
			****************************************************************************/
			System.out.println("Enter the length of a side of the house: ");
			double sideLength = input.nextDouble();
			input.nextLine();
			/****************************************************************************
			* Calculates flooringArea, roofArea, wallArea, totalSurfaceArea, and houseCost
			****************************************************************************/
			double flooringArea = 2 * (Math.pow(sideLength, 2)) * (1 + (Math.sqrt(2)));
			double roofArea = flooringArea;
			double wallArea = 8 * 12 * sideLength;
			double totalSurfaceArea = flooringArea + roofArea + wallArea;
			double houseCost = totalSurfaceArea * 14.50;
			/****************************************************************************
			* Outputs the settlers name, total surface area, and house cost
			****************************************************************************/
			System.out.printf("%s has a house surface area of %,.2f and cost of $%,.2f\n", name, totalSurfaceArea, houseCost);
			/****************************************************************************
			* Determines if user would want to repeat the process
			****************************************************************************/
			System.out.println("Would you like to enter another house? Enter no to exit.");
			answer = input.nextLine();
		}
	}
}
