public class CreditCard {
    private final String name;
    private final String cardNumber;
    private final int expiryMonth;
    private final int expiryYear;
    private final int cvv;

    public CreditCard(String name, String cardNumber, int expiryMonth, int expiryYear, int cvv) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.expiryMonth = expiryMonth;
        this.expiryYear = expiryYear;
        this.cvv = cvv;
    }

    public String getCardName() {
        return name;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public int getExpiryMonth() {
        return expiryMonth;
    }

    public int getExpiryYear() {
        return expiryYear;
    }

    public int getCardCvv() {
        return cvv;
    }
}