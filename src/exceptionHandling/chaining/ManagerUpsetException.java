package exceptionHandling.chaining;

public class ManagerUpsetException extends RuntimeException {
    public ManagerUpsetException(String message, Throwable cause) {
        super(message, cause);
    }

    public ManagerUpsetException(String message) {
        super(message);
    }
}
