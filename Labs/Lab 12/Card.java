package Lab12;

public class Card {
    /************************
     * Naming instance variables
     *************************/
    private String name;

    /************************
     * Default constructor
     *************************/
    public Card() {
        name = "";
    }

    /************************
     * Parameterized constructor
     *************************/
    public Card(String name) {
        this.name = name;
    }

    /************************
     * toString method to display constructor
     *************************/
    public String toString() {
        String cardHolder = "Card Holder: " + this.name;
        return cardHolder;
    }
}
