package diaries;

public class InvalidUserNameLengthException extends RuntimeException {
    public InvalidUserNameLengthException(String message) {
        super(message);
    }
}
