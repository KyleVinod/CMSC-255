package Lab11;

public class Book {
    /****************************
     * Setting the instance variables
     *****************************/
    private String title;
    private String author;

    /****************************
     * Default constructor
     *****************************/
    public Book(){
        title = "Test";
        author = null;
    }

    /****************************
     * Making parameterized constructor
     *****************************/
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    /****************************
     * The getter and setter methods are made for the title and author
     *****************************/
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    /****************************
     * The toString method is created
     *****************************/
    public String toString() {
        return String.format("\"%s\" by %s", this.title, this.author);
    }
}
