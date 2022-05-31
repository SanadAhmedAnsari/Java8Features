package lambda.Comparator;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {
    public List<Book> getBooks() {
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "Java", 100));
        books.add(new Book(2, "DS", 200));
        books.add(new Book(3, "Python", 300));
        books.add(new Book(4, "Oracle", 400));
        books.add(new Book(5, "C++", 500));
        return books;
    }
}
