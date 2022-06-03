package todos;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class TodosTest {

    @TempDir
    Path tempDir;

    @Test
    void writeTo() throws IOException {
        System.out.println(tempDir);

        Path file = tempDir.resolve("todos.txt");
        System.out.println(file);

        Todos todos = new Todos();
//        todos.addTodo("Kenyér");
//        todos.addTodo("Tej");
        //todos.addTodos("Kenyér", "Tej");

        todos
            .addTodo("Kenyér")
            .addTodo("Tej");

        todos.complete("Tej");

        todos.writeTo(file);

        assertEquals("""
                [ ] Kenyér
                [x] Tej
                """.replace("\n", "\r\n"), Files.readString(file));
    }
}