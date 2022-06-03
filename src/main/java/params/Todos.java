package params;

import java.util.ArrayList;
import java.util.List;

public class Todos {

    List<String> tasks = new ArrayList<>();

    public void addTask(String task) {
        tasks.add(task);
    }

    public List<String> getTasks() {
        //return new ArrayList<>(tasks);
        return List.copyOf(tasks);
    }
}
