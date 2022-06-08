package collections;

import java.text.Collator;
import java.util.*;

public class BookMain {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>(
                List.of(
                        new Book("ccc", "yy"),
                        new Book("bbb", "xxxx"),
                        new Book("aaa", "xxxxxxx"),
                        new Book("ccc", "x")
                )
        );

//        Collections.sort(books); // natural order
        Collections.sort(books, new BookTitleLengthComparator());
        System.out.println(books);

        Set<Book> booksSet = new TreeSet<>(new BookTitleLengthComparator());
        booksSet.addAll(books);

        System.out.println(booksSet);

        for (Book book: booksSet) {
            System.out.println(book);
        }

        // class collections.Employee cannot be cast to class java.lang.Comparable
//        Set<Employee> employees = new TreeSet<>();
//        employees.add(new Employee("John Doe"));

        Set<Employee> employees = new TreeSet<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        employees.add(new Employee("John Doe"));


        List<String> names = new ArrayList<>(List.of("Attila", "Géza", "Árpád", "István", "Örs"));
        Collections.sort(names);
        System.out.println(names);

        // Collator
//        Collections.sort(names, Collator.getInstance(new Locale("hu", "HU")));
//        System.out.println(names);

        names.sort(Collator.getInstance(new Locale("hu", "HU")));
        System.out.println(names);

        System.out.println(Collections.min(names));
        System.out.println(Collections.min(names, Collator.getInstance(new Locale("hu", "HU"))));
    }
}
