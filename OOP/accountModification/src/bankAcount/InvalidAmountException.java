package bankAcount;

public class InvalidAmountException extends RuntimeException {
    public String message;
    //private String message;
    public InvalidAmountException(String message) {
        super("Invalid amount");
        //this.message = "Invalid amount";
    }
}
