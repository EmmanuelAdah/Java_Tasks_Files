package bankAcount;

public class InvalidAmountExeption extends RuntimeException {
    //private String message;
    public InvalidAmountExeption() {
        super("Invalid amount");
        //this.message = "Invalid amount";
    }
}
