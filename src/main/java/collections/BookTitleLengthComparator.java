package collections;

import java.util.Comparator;

public class BookTitleLengthComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getTitle().length() - o2.getTitle().length();
    }
}
