public class CreditCard {
    private String name;
    private String cardNumber;
    private String expiryMonth;
    private String expiryYear;
    private String cvv;
    private CardType cardType;

    public CreditCard(String name, String cardNumber, String expiryMonth, String expiryYear, String cvv) {
        name = name;
        cardNumber = cardNumber;
        expiryMonth = expiryMonth;
        expiryYear = expiryYear;
        cvv = cvv;
    }

    public String getName(){
        return name;
    }

    public String getCardNumber(){
        return cardNumber;
    }

    public String getExpiryMonth(){
        return expiryMonth;
    }

    public String getExpiryYear(){
        return expiryYear;
    }

    public String getCvv(){
        return cvv;
    }

}