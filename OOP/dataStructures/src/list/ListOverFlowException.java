package list;

public class ListOverFlowException extends RuntimeException {
    private String message;
    public ListOverFlowException(String message) {
        super(message);
    }
}
