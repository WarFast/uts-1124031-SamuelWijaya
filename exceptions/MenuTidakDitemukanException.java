package exceptions;

public class MenuTidakDitemukanException extends RuntimeException {
    public MenuTidakDitemukanException(String message) {
        super(message);
    }
}
