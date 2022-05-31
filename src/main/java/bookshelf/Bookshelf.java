package bookshelf;

import java.util.ArrayList;
import java.util.List;

public class Bookshelf {

    private List<Book> books = new ArrayList<>();

    public void addBook(String title, int year) {
        books.add(new Book(title, year));
    }

    public List<Book> getBooks() {
        return books;
    }
}
