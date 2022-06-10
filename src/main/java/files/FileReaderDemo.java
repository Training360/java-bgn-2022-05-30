package files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReaderDemo {

    public static void main(String[] args) {
        try (var reader = new BufferedReader(
                new InputStreamReader(FileReaderDemo.class.getResourceAsStream("/hello.txt")))) {
            reader.lines()
                    .forEach(System.out::println);
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
