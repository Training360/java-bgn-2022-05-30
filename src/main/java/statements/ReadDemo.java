package statements;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        String alma = scanner.nextLine();
//        String enter = scanner.nextLine();
//        System.out.println("adsgdrfsgdw");
        String korte = scanner.nextLine();
        System.out.println(korte);
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println(alma);
        System.out.println(korte);
        System.out.println(age);
    }
}
