package files;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;

@Slf4j
public class FilesDemo {

    public static void main(String[] args) {
        var path = Path.of("MOCK_DATA.csv");

        String content = """
                aaababababababababababbababababababaababaababa
                aaababababababababababbababababababaababaababa
                aaababababababababababbababababababaababaababa
                aaababababababababababbababababababaababaababa
                """;

//        try (var reader = Files.newBufferedReader(path)) {
        try (
                var reader = new BufferedReader(new StringReader(content));
                var outputStream = Files.newOutputStream(Path.of("bytes.dat"))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);

                byte[] bytes = line.getBytes();
                for (var b: bytes) {
                    outputStream.write(b + 1);
                }
            }
        }
        catch (IOException ioe) {
            log.error("Can not read file", ioe);
        }
    }
}
