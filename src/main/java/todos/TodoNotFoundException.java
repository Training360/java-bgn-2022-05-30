package todos;

public class TodoNotFoundException extends RuntimeException {

    private String task;

    public TodoNotFoundException(String message, String task) {
        super(message);
        this.task = task;
    }
}
