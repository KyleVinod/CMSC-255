package Lab6;
import java.util.ArrayList;
/********************************************
 * Project 6 Martian Houses
 *********************************************
 * design a data type using abstraction, that models the houses within the housing
 * developments and another one that models the housing developments
 * Kyle Vinod
 * 11/11/21
 * CMSC 255 - 004
 *********************************************/
public class Development extends House{
    /********************************************
     * Instances variables created
     *********************************************/
    private String name;
    private String location;
    private int yearEst;
    private int numLots;
    private ArrayList<House> houses;

    /********************************************
     * Default constructor created
     *********************************************/
    public Development() {
        name = null;
        location = null;
        yearEst = 0;
        numLots = 0;
        houses = new ArrayList<>();
    }

    /********************************************
     * Parameterized constructor
     *********************************************/
    public Development(String name, String location, int yearEst, int numLots) {
        this.name = name;
        this.location = location;
        this.yearEst = yearEst;
        this.numLots = numLots;
        houses = new ArrayList<>();
    }

    /********************************************
     * Get and set methods for all variables
     *********************************************/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getYearEst() {
        return yearEst;
    }

    public void setYearEst(int yearEst) {
        this.yearEst = yearEst;
    }

    public int getNumLots() {
        return numLots;
    }

    public void setNumLots(int numLots) {
        this.numLots = numLots;
    }

    public void addHouse(House house) {
        this.houses.add(house);
    }

    public int getNumHouses() {
        int numHouses = houses.size();
        return numHouses;
    }

    public ArrayList<House> getHouses() {
        return houses;
    }

    /********************************************
     * toString method entered
     *********************************************/
    public String toString() {
        String result = this.name + "\n" + this.location + "\n" + this.yearEst + "\n" + this.numLots + "\nHouses:" + "\n"  + "\n" + super.toString();
        return result;
    }
}
