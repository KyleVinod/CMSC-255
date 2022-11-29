import java.util.Scanner;

public class MiddleString {
 public static void main(String [] args) {
	 /**********************************************************
	 * Scanner implemented
	 **********************************************************/
  Scanner scnr = new Scanner(System.in);
  
  /**********************************************************
  * Asking user to enter three strings and getting lengths of them
  **********************************************************/
  System.out.println("Enter three strings:");
  String str1 = scnr.next();
  String str2 = scnr.next();
  String str3 = scnr.next();
  str1.substring(str1.length());
  str2.substring(str2.length());
  str3.substring(str3.length());
  
  
  String middle;
  
  /**********************************************************
  * Determining the middle string of the selected three strings
  **********************************************************/
  if ((str1.compareTo(str2) <= 0) && (str1.compareTo(str3) <= 0)) {
	  if (str2.compareTo(str3) <= 0) {
		  middle = str2;
	  }
	  else {
		  middle = str3;
	  }
  }
  else if ((str2.compareTo(str3) <= 0)) {
	  if (str1.compareTo(str3) <= 0) {
		  middle = str1;
	  }
	  else {
		  middle = str2;
	  }
  }
  else {
	  if (str1.compareTo(str2) <= 0) {
		  middle = str1;
	  }
	  else {
		  middle = str2;
	  }
  }
  /**********************************************************
  * Outputs the middle string
  **********************************************************/
  System.out.println(middle);
 }
}
