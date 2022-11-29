package Lab11;

import java.util.ArrayList;
public class Bookshelf {
    /****************************
     * Instance variables are made
     *****************************/
    private int size;
    private ArrayList<Book> books;

    /****************************
     * Default constructor
     *****************************/
    public Bookshelf() {
        size = 2;
        books = new ArrayList<>();
    }

    /****************************
     * Parameteried constructor
     *****************************/
    public Bookshelf(int size) {
        this.size = size;
        books = new ArrayList<>();
    }

    /****************************
     * Getter method made for size and books
     *****************************/
    public int getSize() {
        return size;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    /****************************
     * Method made to add books to ArrayList
     *****************************/
    public void addBook(Book books) {
        int space = this.books.size();
        if(space < this.size) {
            this.books.add(books);
        }
    }

    /****************************
     * Made to remove the first book from ArrayList
     *****************************/
    public ArrayList<Book> removeBook() {
        if (books.size() > 0) {
            books.remove(0);
            return books;
        }
        else {
            return null;
        }
    }

    /****************************
     * Used to clear entire ArrayList
     *****************************/
    public void emptyBookshelf() {
        books.clear();
    }
}
