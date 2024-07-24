package exceptionHandling.chaining;

public class NoLeaveGrantedException extends RuntimeException {
    public NoLeaveGrantedException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoLeaveGrantedException(String message) {
        super(message);
    }
}
