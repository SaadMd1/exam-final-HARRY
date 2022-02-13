package price;

import cart.Book;

import java.util.HashSet;

// cette classe elle initialise  un livre et sa remise
public class BooksSet {
    private HashSet<Book> books; // tableau dynamique
    private int discount;

    public BooksSet(HashSet<Book> books, int discount){
        this.books = books;
        this.discount = discount;
    }

    public HashSet<Book> getBooks() {
        return books;
    }

    public int getDiscount() {
        return discount;
    }
}
