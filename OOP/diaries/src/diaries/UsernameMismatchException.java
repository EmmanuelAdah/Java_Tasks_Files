package diaries;

public class UsernameMismatchException extends RuntimeException {
    public UsernameMismatchException(String message) {
        super(message);
    }
}
