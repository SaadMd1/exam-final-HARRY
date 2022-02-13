import cart.Book;

import java.util.HashSet;

public class Test {
    public static void main(String args[]){
        HashSet<Book> books = new HashSet<>();
        books.add(Catalog.GivenAHarryPotterIBook());
        books.add(Catalog.GivenAHarryPotterIIBook());
        books.add(Catalog.GivenAHarryPotterIIIBook());
        books.add(Catalog.GivenAHarryPotterIVBook());
        books.add(Catalog.GivenAHarryPotterVBook());//a
        /*for(Book o:books){
            System.out.println(o.getPrice());
        }*/



    }
}
