package bankAcount;

public class InvalidAmountExeption extends RuntimeException {
    private String message;
    public InvalidAmountExeption() {
        this.message = "Invalid amount";
    }
}
