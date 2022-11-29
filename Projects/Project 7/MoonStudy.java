package Project7;
/****************************************************************************
 * Moon Study
 ****************************************************************************
 * Create a MoonStudy project
 * Kyle Vinod
 * 12/3/2021
 * CMSC 255 004
 ****************************************************************************/

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MoonStudy {
    public static void main(String [] args) {try {
        BufferedReader in = new BufferedReader(new FileReader("file path"));
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
        /***************************************************************************
         * Scanner implemented
         ****************************************************************************/
        Scanner input = new Scanner(System.in);
        /***************************************************************************
         * Setting File variables
         ****************************************************************************/
         File inputFile = new File(args[0]);
         File outputFile = new File(args[1]);

        /***************************************************************************
         * Getting values from inputFile
         ****************************************************************************/
        ArrayList<String> x = new ArrayList<>();
        try {
            x = openFile(inputFile);
            System.out.println("Input file correct");
        } catch (FileNotFoundException e) {
            System.out.println("Incorrect input filename");
        }
        /***************************************************************************
         * Creating new ArrayList
         ****************************************************************************/
        ArrayList<Moon> y = createObjects(x);
        String g = input.nextLine();
        double a = findMean(y, g);
        int value = input.nextInt();
        /***************************************************************************
         * Putting Arraylist into methods
         ****************************************************************************/
        Double highestValue = findHighValue(y, g);
        Moon findMoon = findMeanMoon(y, g, a);
        ArrayList<Moon> lowestMoon = findLowestMoons(y, value, g);
        /***************************************************************************
         * Setting OutputFile
         ****************************************************************************/
        try {
            String outputMessage = "Output file correct";
            PrintWriter output = new PrintWriter(outputFile);
            outputToFile(outputMessage, y, output);
        } catch (FileNotFoundException e) {
            System.out.println("Incorrect output filename");
        }

    }

    /***************************************************************************
     * Creates new String ArrayList
     ****************************************************************************/
    public static ArrayList<String> openFile(File inputFile) throws FileNotFoundException {
        try {
            BufferedReader in = new BufferedReader(new FileReader("file path"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner in = new Scanner(inputFile);
        String str;
        ArrayList<String> data = new ArrayList<>();
        while(str = in.readLine()) != null) {
            data.add(in.nextLine().split(" "));
        }
        return data;
    }

    /***************************************************************************
     * Creating second new Moon ArrayList
     ****************************************************************************/
    public static ArrayList<Moon> createObjects(ArrayList<String> lines) throws NumberFormatException {
        ArrayList<Moon> results = new ArrayList<Moon>();
        for (String i : lines
             ) {
            double temp1 = 0.0;
            double temp2 = 0.0;
            double temp3 = 0.0;
            String[] temp = i.split("\t");
            if (temp.length >= 2) {
                try {
                    temp1 = Double.parseDouble(temp[1]);
                    if (temp1 < 0) {
                        temp1 = 0;
                    }
                } catch (NumberFormatException ex) {
                    temp1 = 0.0;
                }
            }
            if (temp.length >= 3) {
                try {
                    temp2 = Double.parseDouble(temp[2]);
                    if (temp2 < 0) {
                        temp2 = 0;
                    }
                } catch (NumberFormatException ex) {
                    temp2 = 0.0;
                }
            }
            if (temp.length >= 4) {
                try {
                    temp3 = Double.parseDouble(temp[3]);
                    if (temp3 < 0) {
                        temp3 = 0;
                    }
                } catch (NumberFormatException ex) {
                    temp3 = 0.0;
                }
            }
            results.add(new Moon(temp[0], temp1, temp2, temp3));
        }
        return results;
    }

    /***************************************************************************
     * Finding mean value
     ****************************************************************************/
    public static double findMean(ArrayList<Moon> moons, String attribute){
        double mean = 0;
        double num = 0;
        double total = 0;
        for (int i = 0; i < moons.size(); i++) {
            if (attribute.equals("radius")) {
                num += moons.get(i).getRadius();
                total++;
            }
            if (attribute.equals("density")) {
                num += moons.get(i).getDensity();
                total++;
            }
            if (attribute.equals("distance")) {
                num += moons.get(i).getDistance();
                total++;
            }
        }
        mean = num / total;
        return mean;
    }

    /***************************************************************************
     * Finding highest value
     ****************************************************************************/
    public static double findHighValue(ArrayList<Moon> moons, String attribute){
        double value = 0;
        double num = 0;
        for (int i = 0; i < moons.size(); i++) {
            if (attribute.equals("radius")) {
                num = moons.get(i).getRadius();
                if (num > value) {
                    value = num;
                }
            }
            if (attribute.equals("density")) {
                num = moons.get(i).getDensity();
                if (num > value) {
                    value = num;
                }
            }
            if (attribute.equals("distance")) {
                num = moons.get(i).getDistance();
                if (num > value) {
                    value = num;
                }
            }
        }
        return value;
    }

    /***************************************************************************
     * Funding moon closest to mean
     ****************************************************************************/
    public static Moon findMeanMoon(ArrayList<Moon> moons, String attribute, double meanValue){
        Moon meanMoon = new Moon();
        double num = Double.MAX_VALUE;
        for (int i = 0; i < moons.size(); i++) {
            if (attribute.equals("radius")) {
                double newNum = Math.abs(meanValue - moons.get(i).getRadius());
                if (newNum < num) {
                    num = newNum;
                    meanMoon = moons.get(i);
                }
            }
            if (attribute.equals("density")) {
                double newNum = Math.abs(meanValue - moons.get(i).getDensity());
                if (newNum < num) {
                    num = newNum;
                    meanMoon = moons.get(i);
                }
            }
            if (attribute.equals("distance")) {
                double newNum = Math.abs(meanValue - moons.get(i).getDistance());
                if (newNum < num) {
                    num = newNum;
                    meanMoon = moons.get(i);
                }
            }
        }
        return meanMoon;
    }

    /***************************************************************************
     * Finding lowest value moon
     ****************************************************************************/
    public static ArrayList<Moon> findLowestMoons(ArrayList<Moon> moons, double value, String attribute){
        ArrayList<Moon> lowestMoon = new ArrayList<>();
        double num = 0;
        for (int i = 0; i < moons.size(); i++) {
            if (attribute.equals("radius")) {
                num = moons.get(i).getRadius();
                if (num < value) {
                    lowestMoon.add(moons.get(i));
                }
            }
            if (attribute.equals("density")) {
                num = moons.get(i).getDensity();
                if (num < value) {
                    lowestMoon.add(moons.get(i));
                }
            }
            if (attribute.equals("distance")) {
                num = moons.get(i).getDistance();
                if (num < value) {
                    lowestMoon.add(moons.get(i));
                }
            }
        }
        return lowestMoon;
    }

    /***************************************************************************
     * Printing values
     ****************************************************************************/
    public static void outputToFile(String outputMessage, ArrayList<Moon> moons, PrintWriter out) throws FileNotFoundException {
        out.write(outputMessage);
        for (int i = 0; i < moons.size(); i++) {
            if (i == moons.size() - 1) {
                out.write(moons.get(i).toString());
            }
            else {
                out.write(moons.get(i).toString() + " ");
            }
        }
    }
    public static void outputToFile(String outputMessage, Moon moon, PrintWriter out) throws FileNotFoundException {
        out.write(outputMessage + moon.toString() + "\n\n");
    }
    public static void outputToFile(String outputMessage, double value, PrintWriter out) throws FileNotFoundException {
        out.write(outputMessage + String.format("%.2f", value) + "\n\n");
    }
}
