package oo;

public class ObjectOrientedDemo {

    public static void main(String[] args) {
        Book book = new Book("Advanced Java", 1900);

        Book another = new Book(book);

        System.out.println(another.getTitle());
        System.out.println(another.getYear());

        System.out.println(book);

    }
}
