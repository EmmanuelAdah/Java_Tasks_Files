public class CreditCard {
    private final String name;
    private final String cardNumber;
    private final int expiryMonth;
    private final int expiryYear;
    private final int cvv;
    private final CardType cardType;

    public CreditCard(String name, String cardNumber, int expiryMonth, int expiryYear, int cvv, CardType cardType) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.expiryMonth = expiryMonth;
        this.expiryYear = expiryYear;
        this.cvv = cvv;
        this.cardType = cardType;
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

    public String getCardType() {
        return cardType.toString();
    }
}