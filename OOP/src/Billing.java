public class Billing extends CreditCard {
    private String phoneNumber;

    public Billing(String name, String phoneNumber, String cardNumber, int expiryMonth, int expiryYear, int cvv){
        super(name, cardNumber, expiryMonth, expiryYear, cvv);

        if (phoneNumber.chars().allMatch(Character::isDigit)) {
            this.phoneNumber = phoneNumber;
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}

