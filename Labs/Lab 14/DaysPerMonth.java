package Lab14;

import java.io.*;
import java.util.Scanner;

/**
 *   DaysPerMonth
 *   VCU - Computer Science Department
 *   A program that prompts the user for a month and year (both as integers)
 *   then displays the number of days in that month.
 **/

public class DaysPerMonth {

    public static void main(String[] args){
        /*******************************
         * Scanner inplemented
         ********************************/
        Scanner in = new Scanner(System.in);
        /*******************************
         * Entering File variables and entering to go through processFile
         ********************************/
        File inputFile = null;
        File outputFile = null;
        if (args.length != 0) {
            inputFile = new File(args[0]);
            outputFile = new File(args[1]);
        }
        else {
            System.out.println("Enter an input file");
            String name = in.nextLine();
            inputFile = new File(name);
            outputFile = new File("lab14Output.txt");
        }
        /*******************************
         * Goes through processFile
         ********************************/
        try {
            processFile(inputFile, outputFile);
        } catch (FileNotFoundException e) {
            System.out.println("Bad File Name");
        }


    }


    public static void processFile(File inputFile, File outputFile) throws FileNotFoundException {
        /*******************************
         * Scanner implemented
         ********************************/
        Scanner input = new Scanner(inputFile);

        /*******************************
         * Entering variables
         ********************************/
        FileWriter output = null;
        int month = 0;
        int year = 0;
        String results = "";
        try {
            /*******************************
             * To write everything into the outputFile
             ********************************/
            output = new FileWriter(outputFile);
            while(input.hasNextLine()) {
                try {
                    /*******************************
                     * Seperating the month and year, and turning them into integers
                     ********************************/
                    String[] data = input.nextLine().split(",");
                    month = Integer.parseInt(data[0]);
                    year = Integer.parseInt(data[1]);
                    /*******************************
                     * Determines the error with the month and year
                     ********************************/
                    if (month < 1 || month > 12) {
                        results = ("Month must be between 1 and 12\n");
                    }
                    else {
                        if (year < 0) {
                            results = ("Year cannot be negative\n");
                        } else {
                            /*******************************
                             * Tells the days in the month
                             ********************************/
                            int numDays = getDays(month, year);
                            results = ("There are " + numDays + " days in this month.\n");
                        }
                    }
                }
                /*******************************
                 * Tells if the variable isn't an integer
                 ********************************/
                catch  (NumberFormatException e){
                    results = ("Not an integer\n");
                }
                /*******************************
                 * Displays results
                 ********************************/
                output.write(results);
            }
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * method to determine the days for the given month and year
     **/
    private static int getDays(int mon, int yr) {
        int numDays = 0;

        switch(mon) {
            case 2: // February
                numDays = 28;
                if (yr % 4 == 0) {
                    numDays = 29;
                    if (yr % 100 == 0 && yr % 400 != 0) {
                        numDays = 28;
                    }
                }
                break;

            case 4:   //April
            case 6:   // June
            case 9:   // September
            case 11:  // November
                numDays = 30;
                break;

            default: numDays = 31;  // all the rest
        }
        return numDays;
    }

}
