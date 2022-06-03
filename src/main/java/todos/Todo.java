package todos;

public class Todo {

    private String task;

    private boolean completed;

    public Todo(String task) {
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void complete() {
        completed = true;
    }
}
