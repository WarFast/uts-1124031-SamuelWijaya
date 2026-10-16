package exceptions;

public class InputTidakValidException extends RuntimeException {
    public InputTidakValidException(String message) {
        super(message);
    }
}
