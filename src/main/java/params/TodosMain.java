package params;


import java.util.List;

public class TodosMain {

    public static void main(String[] args) {
        Todos todos = new Todos();
        todos.addTask("alma");
        todos.addTask("korte");

        List<String> tasks = todos.getTasks();
        tasks.add("meggy");

        System.out.println(todos.getTasks());
    }
}
