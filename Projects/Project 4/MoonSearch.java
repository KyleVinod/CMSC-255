/****************************************************************************
 * MoonSearch Project
 ****************************************************************************
 * The project will give the avetrage radii and fensity, highest radii, lowest mars distance, highest moon for radii, lowest moon for density, and determines if the user typed in a moon in the array
 * Kyle Vinod
 * 10/17/2021
 * CMSC 255 - 004
 ***************************************************************************/

import java.util.Scanner;

public class MoonSearch {
    public static void main(String [] args) {
        /***************************************************************************
         * Typing in the info for the arrays
         **************************************************************************/
        Scanner input = new Scanner(System.in);
        String[] moonNames = {"Phobus", "Deimos", "Adrastea", "Aitne", "Amalthea", "Ananke", "Aoede", "Arche"};
        double[] radii = {11.3, 6.2, 68.9, 33.6, 71.2, 26.8, 255.9, 47.4};
        double[] density = {1.8, 1.4, 14.2, 33.3, 16.4, 68.1, 121.3, 38.2};
        double[] marsDistance = {3.7, 23.4, 550391.6, 227894.9, 778893.6, 143323.5, 287223.5, 449655.1};
        /**************************************************************************
         * Getting the average of radii
         *************************************************************************/
        double x = calcAvg(radii);
        System.out.printf("The average radius is: %.1f\n" , x);
        /**************************************************************************
         * Getting the average of the density
         *************************************************************************/
        double y = calcAvg(density);
        System.out.printf("The average density is: %.1f\n" , y);
        /**************************************************************************
         * Getting the highest radius value
         *************************************************************************/
        double a = findHighValue(radii);
        System.out.printf("The highest radius is: %.1f\n" , a);
        /**************************************************************************
         * Getting the lowest distance value
         *************************************************************************/
        double b = findLeastValue(marsDistance);
        System.out.printf("The lowest distance is: %.1f\n" , b);
        /**************************************************************************
         * Getting the moons with the highest radius
         *************************************************************************/
        String[] c = findHighestTwo(moonNames, radii);
        System.out.println("The highest two moons for radii are:\n" + c[0] + "\n" + c[1]);
        /**************************************************************************
         * Getting the moons with the lowest density
         **************************************************************************/
        String[] d = findLeastTwo(moonNames, density);
        System.out.println("lowest two moons\n" + d[0] + "\n" + d[1]);
        /**************************************************************************
         * Asks the user to enter a name for a moon, and determines if moon is in the array
         *************************************************************************/
        System.out.println("Enter a moon: ");
        String bonk = input.nextLine();
        boolean z = findMoon(moonNames, bonk);
        if (z == (true)) {
            System.out.println(bonk + " is a moon in the array.");
        }
        else {
            System.out.println(bonk + " is not a moon in the array.");
        }
    }
    public static double calcAvg(double [] values) {
        /**************************************************************************
         * Method calculates the average of the array entered in
         *************************************************************************/
       double average = 0;
        for (int i = 0; i < values.length; i++) {
            average += values[i];
        }
        average = average / values.length;
        return average;
    }
    public static double findHighValue(double[] values) {
        /**************************************************************************
         * Finds the highest value of whatever array is entered
         *************************************************************************/
        double bigValue = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] > bigValue) {
                bigValue = values[i];
            }
        }
        return bigValue;
    }
    public static double findLeastValue(double[] values) {
        /**************************************************************************
         * Finds the lowest value for the array entered
         *************************************************************************/
        double smallValue = 100000000;
        for (int i = 0; i < values.length; i++) {
            if (values[i] < smallValue) {
                smallValue = values[i];
            }
        }
        return smallValue;
    }
    public static String[] findHighestTwo(String[] names, double[] values) {
        /**************************************************************************
         * Finds the moons that have the highest values of the array entered
         *************************************************************************/
        String[] moons = new String[2];
        double bigValue1 = 0;
        double bigValue2 = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] > bigValue1) {
                bigValue1 = values[i];
            }
        }
        for (int x = 0; x < values.length; x++) {
            if (bigValue1 != values[x] && values[x] > bigValue2) {
                bigValue2 = values[x];
            }
        }
        for (int i = 0; i < names.length; i++) {
            if (bigValue1 == values[i]) {
                moons[0] = names[i];
            }
            if (bigValue2 == values[i]) {
                moons[1] = names[i];
            }
        }
        return moons;
    }
    public static String[] findLeastTwo(String[] names, double[] values) {
        /**************************************************************************
         * Finds the moon with the lowest values of the array entered
         *************************************************************************/
        String[] boop = new String[2];
        double smallValue1 = 100000000;
        double smallValue2 = 100000000;
        for (int i = 0; i < values.length; i++) {
            if (values[i] < smallValue1) {
                smallValue1 = values[i];
            }
        }
        for (int i = 0; i < values.length; i++) {
            if (smallValue1 != values[i] && values[i] < smallValue2) {
                smallValue2 = values[i];
            }
        }
        for (int i = 0; i < names.length; i++) {
            if (smallValue1 == values[i]) {
                boop[0] = names[i];
            }
            if (smallValue2 == values[i]) {
                boop[1] = names[i];
            }
        }
        return boop;
    }
    public static boolean findMoon(String[]names, String moon) {
        /**************************************************************************
         * Determines if the moon entered by the user is in the array
         *************************************************************************/
        boolean truth = false;
        for (int i = 0; i < names.length; i++) {
            if (moon.equals(names[i])) {
                truth = true;
            }
            else {
                if (i == names.length) {
                    truth = false;
                }
            }
        }
        return truth;
    }
}
