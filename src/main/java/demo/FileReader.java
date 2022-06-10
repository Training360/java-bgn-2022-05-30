package demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileReader {

    public static void main(String[] args) {
        Path path = Path.of("OCK_DATA.csv");
        try {
            List<String> lines = Files.readAllLines(path);
        } catch (IOException e) {
            //throw new IllegalStateException("Can not read file: MOCK_DATA.csv", e);
            System.err.println("Hiba");

        } finally {
            System.out.println("grrrr");
        }
    }
}
