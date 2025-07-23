package phoneBook;

public class InvalidNumberLengthException extends RuntimeException {
    public InvalidNumberLengthException(String massage) {
        super(massage);
    }
}
