package exceptionHandling.chaining;

public class ManagerWifeUpsetException extends RuntimeException {
    public ManagerWifeUpsetException(String message, Throwable cause) {
        super(message, cause);
    }

    public ManagerWifeUpsetException(String message) {
        super(message);
    }
}
