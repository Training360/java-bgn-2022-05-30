package intro;

import java.util.Scanner;

public class InputMain {

    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println(name.toUpperCase());

        System.out.println("What is your age?");
        int age = scanner.nextInt();

        System.out.println("Welcome " + name + "!");
        System.out.println("Your age is " + age);
    }
}
