package oo;

import java.util.ArrayList;
import java.util.List;

public class ReferenceDemo {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Jane", "Jack"));

        List<String> employees = names;

        employees.set(1, "John");
        System.out.println(names);

        Book book = new Book("Java and Training", 1970);

        Book another = book;
        another.setYear(1980);
        System.out.println(book.getYear());
    }
}
