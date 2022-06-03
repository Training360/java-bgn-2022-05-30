package todos;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Todos {

    private List<Todo> items = new ArrayList<>();

    public Todos addTodo(String task) {
        items.add(new Todo(task));
        return this;
    }

    public void addTodos(List<String> tasks) {
        for (var task: tasks) {
            addTodo(task);
        }
    }

    public void addTodos(String task, String... tasks) {
        addTodo(task);
        // addTodos(Arrays.asList(tasks));
        for (var taskToAdd: tasks) {
            addTodo(taskToAdd);
        }
    }

    public void complete(String task) {
        boolean found = false;
        for (var item: items) {
            if (item.getTask().equals(task)) {
                found = true;
                item.complete();
            }
        }
        if (!found) {
//            throw new IllegalArgumentException("Can not find todo with task "
//                + task);
            throw new TodoNotFoundException("Can not find todo with task " + task, task);
        }
    }

    public void writeTo(Path path) {
        List<String> lines = toLines();
        writeToFile(path, lines);
    }

    private void writeToFile(Path path, List<String> lines) {
        try {
            Files.write(path, lines);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not write file " + path, ioe);
        }
    }

    private List<String> toLines() {
        List<String> lines = new ArrayList<>();
        for (var item: items) {
            lines.add(toLine(item));
        }
        return lines;
    }

    private String toLine(Todo todo) {
        return String.format("[%s] %s",
                todo.isCompleted() ? "x" : " ",
                todo.getTask());
    }
}
