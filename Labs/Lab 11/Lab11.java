package Lab11;

public class Lab11 {
    public static void main(String [] args) {
        Book book1 = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling");
        Book book2 = new Book("Harry Potter and the Chamber of Secrets", "J.K. Rowling");
        Book book3 = new Book("Harry Potter and the Prisoner of Azkaban", "J.K. Rowling");

        Bookshelf bookshelf = new Bookshelf(3);
        bookshelf.addBook(book1);
        bookshelf.addBook(book2);
        bookshelf.addBook(book3);

        for (Book item : bookshelf.getBooks()) {
            System.out.println(item.toString());
        }
    }
}
