package exceptionHandling.chaining;

public class TeamLeadUpsetException extends RuntimeException {
    public TeamLeadUpsetException(String message, Throwable cause) {
        super(message, cause);
    }

    public TeamLeadUpsetException(String message) {
        super(message);
    }
}
