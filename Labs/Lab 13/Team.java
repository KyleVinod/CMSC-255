package Lab13;
import java.util.Scanner;

public class Team {
    /******************************
     * Setting instance variables
     *******************************/
    private String name;
    private int numGoals;
    private double numShots;

    /******************************
     * Default constructor
     *******************************/
    public Team() {
        name = "";
        numGoals = 0;
        numShots = 0;
    }

    /******************************
     * Parameterized constructor
     *******************************/
    public Team(String name, int numGoals, double numShots) {
        this.name = name;
        this.numGoals = numGoals;
        this.numShots = numShots;
    }

    /******************************
     * All getter and setter methods
     *******************************/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumGoals() {
        return numGoals;
    }

    public void setNumGoals(int numGoals) {
        this.numGoals = numGoals;
    }

    public double getNumShots() {
        return numShots;
    }

    public void setNumShots(double numShots) {
        this.numShots = numShots;
    }
}
