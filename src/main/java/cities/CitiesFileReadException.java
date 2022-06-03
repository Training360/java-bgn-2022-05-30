package cities;

import java.nio.file.Path;

public class CitiesFileReadException extends RuntimeException {

    private Path path;

    public CitiesFileReadException(String message, Throwable cause, Path path) {
        super(message, cause);
        this.path = path;
    }
}
