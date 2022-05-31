package bookshelf;

import java.util.Scanner;

public class Controller {

    private Scanner scanner = new Scanner(System.in);

    private Bookshelf bookshelf = new Bookshelf();

    public void start() {
        var exited = false;
        do {
            printMenu();
            var choice = scanner.nextLine();
            switch (choice) {
                case "1" -> inputBook();
                case "2" -> printBooks();
                case "3" -> exited = true;
                default -> System.out.println("Nem ismert menüpont!");
            }
//            switch (choice) {
//                case "1":
//                    inputBook();
//                    break;
//                case "2":
//                    printBooks();
//                    break;
//                case "3":
//                    exited = true;
//                    break;
//                default:
//                    System.out.println("Nem ismert menüpont!");
//                    break;
//            }
        } while (!exited);
    }

    private void printBooks() {
        for (var book: bookshelf.getBooks()) {
            System.out.println(book.getTitle());
        }
    }

    private void inputBook() {
        System.out.println("Mi a címe?");
        String title = scanner.nextLine();
        System.out.println("Mi az éve?");
        int year = Integer.parseInt(scanner.nextLine());
        bookshelf.addBook(title, year);
    }

    private void printMenu() {
        String menu = """
            Mit választasz?
            1. Hozzáadás
            2. Listázás
            3. Kilépés 
            """;
        System.out.println(menu);
    }
}
