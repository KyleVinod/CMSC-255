package Lab10;

public class Fan {
    /*************************************************
     * Setting the instance variables
     **************************************************/
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    /*************************************************
     * Default values
     **************************************************/
    public Fan() {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }

    /*************************************************
     * Setting the parameterized constructor
     **************************************************/
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    /*************************************************
     * The getter and setter method
     **************************************************/
    public int getSpeed() {
        return speed;
    }
    public boolean isOn() {
        return on;
    }
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setOn(boolean on) {
        this.on = on;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }

    /*************************************************
     * Setting the results of the fan
     **************************************************/
    public String toString() {
        if (this.isOn() == true) {
            String result = "fan is ";
            result += this.getSpeed() + ", ";
            result += this.getColor() + ", and size ";
            result += this.getRadius();
            return result;
        }
        else {
            return "fan is off";
        }
    }
}
