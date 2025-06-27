public class Billing extends CreditCard {
    private final String phoneNumber;
    private CardType cardType;

    public Billing(String name, String phoneNumber, String cardNumber, String expiryMonth, String expiryYear, String cvv){
        super(name, cardNumber, expiryMonth, expiryYear, cvv);
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }
}

