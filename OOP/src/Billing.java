public class Billing extends CreditCard {
    private String phoneNumber;
    private CardType cardType;

    public Billing(String name, String phoneNumber, String cardNumber, String expiryMonth, String expiryYear, String cvv){
        super(name, cardNumber, expiryMonth, expiryYear, cvv);

        if (phoneNumber.chars().allMatch(Character::isDigit)) {
            this.phoneNumber = phoneNumber;
        }
    }


}

