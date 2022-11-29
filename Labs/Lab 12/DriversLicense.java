package Lab12;

public class DriversLicense extends IDCard{
    /************************
     * Setting the instances variables
     *************************/
    private int expirationYear;
    private Month expirationMonth;

    /************************
     * Default constructor created
     *************************/
    public DriversLicense() {
        super();
        expirationYear = 1969;
        expirationMonth = Month.JANUARY;
    }

    /************************
     * Parameterized constructor created
     *************************/
    public DriversLicense(String name, int idNumber, int expirationYear, Month expirationMonth) {
        super(name, idNumber);
        this.expirationYear = expirationYear;
        this.expirationMonth = expirationMonth;
    }

    /************************
     * toString method to display constructor
     *************************/
    public String toString() {
        String doop = super.toString() + " Expiration Month & Year: " + this.expirationMonth + " " + this.expirationYear;
        return doop;
    }
}
