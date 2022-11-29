/****************************************************************************
* MartianMoney
*****************************************************************************
* Project description
* Kyle Vinod
* 9/8/2021
* CMSC 255 and Project 2 - Money on Mars
****************************************************************************/

import java.util.Scanner;

public class MartianMoney
{
	public static void main(String [] args)
	{
		/****************************************************************************
		* Scanner created
		****************************************************************************/
		Scanner input = new Scanner(System.in);
		
		/****************************************************************************
		* Money is either randomly generated or entered manually
		****************************************************************************/
		System.out.println("Would you like to randomly enter a dollar amount (1) or enter it yourself (2).");
		int x = input.nextInt();
		int moneyAmount = 0;
		if(x == 1){
			moneyAmount = (int)(80 + (Math.random() * 9999920));
			System.out.println(moneyAmount);
		}
		else if (x == 2){
			System.out.println("Enter a dollar amount between $80 and $10,000,000.");
			moneyAmount = input.nextInt();
			if (moneyAmount < 80 || moneyAmount > 10000000) {
				System.out.println("Incorrect input");
			}
		}
		else {
			System.out.println("Incorrect input");
		}
		
		int remainingAmount = moneyAmount;
		
		/****************************************************************************
		* Finding the number of tintina
		****************************************************************************/
		int numberOfTintina = remainingAmount / 80;
		remainingAmount = remainingAmount % 80;
		
		/****************************************************************************
		* Finding the number of sutton
		****************************************************************************/
		int numberOfSutton = remainingAmount / 16;
		remainingAmount = remainingAmount % 16;
		
		/****************************************************************************
		* Finding the number of knorr
		****************************************************************************/
		int numberOfKnorr = remainingAmount / 8;
		remainingAmount = remainingAmount % 8;
		
		/****************************************************************************
		* Finding the number of wernicke
		****************************************************************************/
		int numberOfWernicke = remainingAmount;
		
		/****************************************************************************
		* Displaying the amount of money you would have
		****************************************************************************/
		
		String tintinaString = "";
		if (numberOfTintina > 0) {
			tintinaString = numberOfTintina + " tintina ";
		}
		String suttonString = "";
		if (numberOfSutton > 0) {
			suttonString = numberOfSutton + " sutton ";
		}
		String knorrString = "";
		if (numberOfKnorr > 0) {
			knorrString = numberOfKnorr + " knorr ";
		}
		String wernickeString = "";
		if (numberOfWernicke > 0) {
			wernickeString = numberOfWernicke + " wernicke";
		}
		System.out.println(moneyAmount + " is " + tintinaString + suttonString + knorrString + wernickeString);
	}
}
