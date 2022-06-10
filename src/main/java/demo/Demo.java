package demo;

public class Demo {

    public static void main(String[] args) {
        String name = "John";
        int yearOfBirth = 1970;

        System.out.printf("%s %d éves", name, 2022 - yearOfBirth);
        System.out.println(String.format("%s %d éves", name, 2022 - yearOfBirth));
    }
}
