package Lab6;

/********************************************
 * Project 6 Martian Houses
 *********************************************
 * design a data type using abstraction, that models the houses within the housing
 * developments and another one that models the housing developments
 * Kyle Vinod
 * 11/11/21
 * CMSC 255 - 004
 *********************************************/
public class House {
    /********************************************
     * Instances variables created
     *********************************************/
    private String purchaser;
    private int lotNumber;
    private double squareFootage;


    /********************************************
     * Enum variables entered
     *********************************************/
    Bedrooms bedrooms;
    Baths baths;
    Colors colors;

    /********************************************
     * Default Constructor
     *********************************************/
    public House() {
        purchaser = null;
        lotNumber = 1;
        squareFootage = 500.00;
        bedrooms = Bedrooms.ONE_BEDROOM;
        baths = Baths.ONE;
        colors = Colors.WHITE;
    }

    /********************************************
     * Parameterized constructor
     *********************************************/
    public House(String purchaser, int lotNumber, double squareFootage, Bedrooms bedrooms, Baths baths, Colors colors) {
        this.purchaser = purchaser;
        this.lotNumber = lotNumber;
        this.squareFootage = squareFootage;
        this.bedrooms = bedrooms;
        this.baths = baths;
        this.colors = colors;
    }

    /********************************************
     * All get and set methods for each variable
     *********************************************/
    public String getPurchaser() {
        return purchaser;
    }
    public void setPurchaser(String purchaser) {
        this.purchaser = purchaser;
    }
    public int getLotNumber() {
        return lotNumber;
    }
    public void setLotNumber(int lotNumber) {
        this.lotNumber = lotNumber;
    }
    public double getSquareFootage() {
        return squareFootage;
    }
    public void setSquareFootage(double squareFootage) {
        this.squareFootage = squareFootage;
    }
    public Bedrooms getBedrooms() {
        return bedrooms;
    }
    public void setBedrooms(Bedrooms bedrooms) {
        this.bedrooms = bedrooms;
    }
    public Baths getBaths() {
        return baths;
    }
    public void setBaths(Baths baths) {
        this.baths = baths;
    }
    public Colors getColors() {
        return colors;
    }
    public void setColors(Colors colors) {
        this.colors = colors;
    }

    /********************************************
     * toString method entered
     *********************************************/
    public String toString() {
        String boop = String.format("%s, \n%d, \n%f.2, \n%h, \n%h, \n%h", this.purchaser, this.lotNumber, this.squareFootage, this.bedrooms, this.baths, this.colors);
        return boop;
    }
}
