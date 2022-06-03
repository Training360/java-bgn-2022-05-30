package resources;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class ResourcesDemoMain {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(Path.of("MOCK_DATA.csv")))
        {
            String first = scanner.nextLine();
            System.out.println(first);
        }
        catch (IOException ioe) {
            System.out.println("Nem tudom beolvasni.");
        }
    }
}

