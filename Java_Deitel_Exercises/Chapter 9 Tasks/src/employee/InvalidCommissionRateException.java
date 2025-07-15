package employee;

public class InvalidCommissionRateException extends RuntimeException {
    public InvalidCommissionRateException(String message) {
        super(message);
    }
}
