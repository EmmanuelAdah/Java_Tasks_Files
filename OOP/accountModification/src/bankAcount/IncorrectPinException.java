package bankAcount;

public class IncorrectPinException extends RuntimeException {
    public IncorrectPinException () {
        super ("Incorrect Pin!");
    }
}
