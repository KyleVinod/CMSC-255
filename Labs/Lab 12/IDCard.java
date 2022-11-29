package Lab12;

public class IDCard extends Card{
    /************************
     * Instance variable
     *************************/
    private int idNumber;

    /************************
     * Defauly constructor
     *************************/
    public IDCard() {
        super("Jane Smith");
        idNumber = 0;
    }

    /************************
     * Parameterized constructor
     *************************/
    public IDCard(String name, int idNumber) {
        super(name);
        this.idNumber = idNumber;
    }

    /************************
     * toString method to display constructor
     *************************/
    public String toString() {
        String boop = super.toString() + " ID Number: " + this.idNumber;
        return boop;
    }
}
