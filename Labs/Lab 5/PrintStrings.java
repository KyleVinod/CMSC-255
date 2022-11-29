/**********************************************************
* Kyle Vinod
***********************************************************
* CMSC 255 - 004
**********************************************************/

import java.util.Scanner;

public class PrintStrings
{
	public static void main(String [] args)
	{
		/**********************************************************
		* Scanner implemented
		**********************************************************/
		Scanner input = new Scanner(System.in);
		
		/**********************************************************
		* Asking the user to put two words
		**********************************************************/
		System.out.println("Enter two words: ");
		String word1 = input.next();
		String word2 = input.next();
		word1.substring(word1.length());
		word2.substring(word2.length());
		
		/**********************************************************
		* Determines the lexicographic order of the words and outputs them
		**********************************************************/
		if (word1.compareTo(word2) < 0) {
			System.out.println(word1 + " " + word2);
		}
		else {
			System.out.println(word2 + " " + word1);
		}
	}
}
