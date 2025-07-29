package employee;

public class InvalidSalesAmountException extends RuntimeException {
    public InvalidSalesAmountException(String message) {
        super(message);
    }
}
