public class CreditCard {
    private final String name;
    private final String cardNumber;
    private final String expiryMonth;
    private final String expiryYear;
    private final String cvv;
    private CardType cardType;

    public CreditCard(String name, String cardNumber, String expiryMonth, String expiryYear, String cvv) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.expiryMonth = expiryMonth;
        this.expiryYear = expiryYear;
        this.cvv = cvv;
    }

    public static void setName(String name) {
        name = name.toUpperCase();
    }

    public static String getName() {
        return name;
    }
}