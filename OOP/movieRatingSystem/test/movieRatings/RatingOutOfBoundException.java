package movieRatings;

public class RatingOutOfBoundException extends RuntimeException {
    public RatingOutOfBoundException(String message) {
        super(message);
    }
}
