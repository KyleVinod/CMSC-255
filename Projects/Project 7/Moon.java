package Project7;
/****************************************************************************
 * Moon Study
 ****************************************************************************
 * Create a MoonStudy project
 * Kyle Vinod
 * 12/3/2021
 * CMSC 255 004
 ****************************************************************************/

public class Moon {
    /****************************************************************************
     * Setting instances variables
     * ****************************************************************************/
    private String name;
    private double radius;
    private double density;
    private double distance;

    /***************************************************************************
     * Default constructor
     ****************************************************************************/
    public Moon() {
        name = null;
        radius = 0;
        density = 0;
        distance = 0;
    }

    /***************************************************************************
     * Parameterized constructor
     ****************************************************************************/
    public Moon(String name, double radius, double density, double distance) {
        this.name = name;
        this.radius = radius;
        this.density = density;
        this.distance = distance;
    }

    /***************************************************************************
     * All getter ans setter methods
     ****************************************************************************/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    /***************************************************************************
     * toString method
     ****************************************************************************/
    public String toString() {
        String output = String.format("%s %.2f %.2f %.2f", this.name, this.radius, this.density, this.distance);
        return output;
    }
}
