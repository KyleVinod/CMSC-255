package Lab13;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Lab13 {
    /******************************
     * Processfile method
     *******************************/
    public static void processFile(File inputFile, File outputFile) throws FileNotFoundException {
        /******************************
         * Setting the input scanner for the inputfile
         *******************************/
        Scanner in = new Scanner(inputFile);
        /******************************
         * Entering variables for maxGoals, minGoals, and avgGoals for result
         *******************************/
        int maxGoals = 0;
        int minGoals = 100;
        double avgGoals = 0;
        double total = 0;
        double count = 0;
        String maxTeam = "";
        String minTeam = "";
        /******************************
         * While loop to set the maxGoals, maxTeam, mixGoals, and minTeam
         *******************************/
        while(in.hasNextLine()){
            String[] soccerStats = in.nextLine().split(",");
            String currTeam = soccerStats[0];
            int currGoal = Integer.parseInt(soccerStats[1]);
            double shotsPerGame = Double.parseDouble(soccerStats[2]);

            if(currGoal>maxGoals){
                maxGoals = currGoal;
                maxTeam = currTeam;
            }
            if(currGoal<minGoals){
                minGoals = currGoal;
                minTeam = currTeam;
            }

            total+=shotsPerGame;
            count++;

        }
        /******************************
         * Entering the avgGoals
         *******************************/
        avgGoals = total/count;

        String result = "Maximum goals Scored: " + maxTeam + " " + maxGoals + "\nMinimum goals Scored: " + minTeam + " " + minGoals + "\n";
        String avg = String.format("Average shots per game: %.3f", avgGoals);
        try {
            FileWriter output = new FileWriter(outputFile);
            output.write(result);
            output.write(avg);
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }





    public static void main(String [] args) {
        /******************************
         * Getting the inputs from soccerStats and implementing into soccerSummary
         *******************************/
        File inputFile = new File(args[0]);
        File outputFile = new File(args[1]);

        try{
            processFile(inputFile, outputFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
