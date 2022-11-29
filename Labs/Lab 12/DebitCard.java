package Lab12;

public class DebitCard extends Card{
    /************************
     * Instances variables
     *************************/
    private int cardNumber;
    private int pin;

    /************************
     * Default constructor
     *************************/
    public DebitCard() {
        super("Jane Doe");
        cardNumber = 00000000;
        pin = 0;
    }

    /************************
     * Parameterized constructor
     *************************/
    public DebitCard(String name, int cardNumber, int pin) {
        super(name);
        this.cardNumber = cardNumber;
        this.pin = pin;
    }

    /************************
     * toString method to display the constructor
     */
    public String toString() {
        String statement = super.toString() + " Card Number: " + this.cardNumber;
        return statement;
    }
}
