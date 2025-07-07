public class CreditCard extends Billing {
    private final String name;
    private String cardNumber;
    private final int expiryMonth;
    private final int expiryYear;
    private final int cvv;
    private final CardType cardType;

    public CreditCard(String name, int age, String email, String homeAddress, String password, String phoneNumber, String cardNumber, int expiryMonth, int expiryYear, int cvv, CardType cardType) {
        super(name, age, email, homeAddress, password, phoneNumber);
        this.name = name;
        this.cardNumber = cardNumber;
        this.expiryMonth = expiryMonth;
        this.expiryYear = expiryYear;
        this.cvv = cvv;
        this.cardType = cardType;
    }

    public void validateCreditCard(){
        String cardNumbers = cardNumber.replaceAll("\\s+", "");
        int sumOfEven = 0;
        int sumOfOdd = 0;

        try{
            for(int index = cardNumbers.length() - 1; index >= 0; index--){
                sumOfOdd += Integer.parseInt(String.valueOf(cardNumbers.charAt(index)));
                if (index > 0) index -= 1;

                int multiple = Integer.parseInt(String.valueOf(cardNumbers.charAt(index))) * 2;
                if (multiple > 9){
                    int firstDigit = multiple / 10;
                    int secondDigit =  multiple % 10;
                    sumOfEven += (firstDigit + secondDigit);
                } else {  sumOfEven += multiple;  }
            }
        } catch (InvalidCardException e){
            cardNumber = "Invalid credit card";
        }
        int total = sumOfEven + sumOfOdd;
        cardNumber = (total % 10 == 0 && total != 0) ? cardNumbers : "Invalid";
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