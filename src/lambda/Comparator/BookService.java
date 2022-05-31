package lambda.Comparator;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {

    public List<Book> getBooksInSortedOrder(){
        BookDAO bookDAO = new BookDAO();
        List<Book> books = bookDAO.getBooks();
        //Traditional way
        //Collections.sort(books, new MyComparator());
        //lambda way
        Collections.sort(books, (book1, book2) -> book1.getName().compareTo(book2.getName()));
        return books;
    }

    public static void main(String[] args) {
        System.out.println(new BookService().getBooksInSortedOrder());
    }

 }

/**
 * Traditional way of implementig comparator interface
 */
/*class MyComparator implements Comparator<Book> {
    @Override
    public  int compare(Book b1, Book b2){
        return b1.getName().compareTo(b2.getName());
    }
}*/
