/**********************************************
* Kyle Vinod
**********************************************
* CMSC 255 004
**********************************************/

/**********************************************
* Set up Scanner
* Enter letter for character data type always uppercase
* SWITCH (letter)
	case a, b, c = 2 digit
	case d, e, f = 3 digit
	case g, h, i = 4 digit
	case j, k, l = 5 digit
	case m, n, o = 6 digit
	case p, q, r, s = 7 digit
	case t, u, v = 8 digit
	case w, x, y, z = 9 digit
	default for wrong letter entered
* Output message with their digit
**********************************************/

import java.util.Scanner;

public class PhoneSelection {
	
	public static void main(String [] args) {
	
	/**********************************************
	* Scanner is set up
	**********************************************/
		Scanner scnr = new Scanner(System.in);
		
		/**********************************************
		* Telling the user to enter a letter to let them know the digit on the telephone
		**********************************************/
		System.out.println("Enter a single letter, and I will tell you what the corresponding digit is on the telephone");
		char letter = scnr.next().charAt(0);
		letter = Character.toUpperCase(letter);
		
		/**********************************************
		* Switch that output the number digit for whatever letter they picked
		**********************************************/
		switch (letter) {
			case 'A':
			case 'B':
			case 'C': System.out.println("The digit 2 corresponds to the letter " + letter + " on the telephone.");
					  break;
			case 'D':
			case 'E':
			case 'F': System.out.println("The digit 3 corresponds to the letter " + letter + " on the telephone.");
					  break;
			case 'G':
			case 'H':
			case 'I': System.out.println("The digit 4 corresponds to the letter " + letter + " on the telephone.");
					  break;
			case 'J':
			case 'K':
			case 'L': System.out.println("The digit 5 corresponds to the letter " + letter + " on the telephone.");
					  break;
			case 'M':
			case 'N':
			case 'O': System.out.println("The digit 6 corresponds to the letter " + letter + " on the telephone.");
					  break;
			case 'P':
			case 'Q':
			case 'R':
			case 'S': System.out.println("The digit 7 corresponds to the letter " + letter + " on the telephone.");
					  break;
			case 'T':
			case 'U':
			case 'V': System.out.println("The digit 8 corresponds to the letter " + letter + " on the telephone.");
					  break;
			case 'W':
			case 'X':
			case 'Y':
			case 'Z': System.out.println("The digit 9 corresponds to the letter " + letter + " on the telephone.");
					  break;
			default: System.out.println("There is no matching digit"); break;
		}
	}
}
