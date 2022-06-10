package demo;

public class NotEnoughWaterException extends RuntimeException {

    public NotEnoughWaterException(String message, Throwable cause) {
        super(message, cause);
    }
}
