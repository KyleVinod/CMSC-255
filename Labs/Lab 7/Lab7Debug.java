import java.util.Scanner;

public class Lab7Debug {
  /** Main method */
  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter two integers
    System.out.print("Enter first integer: ");
    int n1 = input.nextInt();
    System.out.print("Enter second integer: ");
    int n2 = input.nextInt();
    int gcd = GCD(n1, n2);

    System.out.println("The greatest common divisor for " + n1 +
                " and " + n2 + " is " + gcd);
  }

  public static int GCD(int n1, int n2){

    int gcd = 1;
    int k = 2;
    int bigNum = 0;
    if (n1 > n2) {
      bigNum = n1;
    }
    else if (n2 > n1) {
      bigNum = n2;
    }
    else {
      bigNum = n1;
    }
    while (k < bigNum) {
      if (n1 % k == 0 && n2 % k == 0)
        gcd = k;
      k++;
    }

    return gcd;
  }
}
