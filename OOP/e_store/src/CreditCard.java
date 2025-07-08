public class CreditCard extends Billing {
    private final String name;
    private String cardNumber;
    private final int expiryMonth;
    private final int expiryYear;
    private final int cvv;
    private CardType cardType;

    public CreditCard(String name, int age, String email, String homeAddress, String password,
                      String phoneNumber, String cardNumber, int expiryMonth, int expiryYear, int cvv) {
        super(name, age, email, homeAddress, password, phoneNumber);
        this.name = name;
        this.cardNumber = cardNumber;
        this.expiryMonth = expiryMonth;
        this.expiryYear = expiryYear;
        this.cvv = cvv;
        }

    private CardType validateCardType() {
        String pan = "";
        if (cardNumber != null) pan = cardNumber.replaceAll("\\s+", "");

        for (int index = 0; index < pan.length(); index++){
            if (pan.charAt(index) < '0' || pan.charAt(index) > '9') throw new InvalidCardException("Invalid card number");
        }
        if (pan.length() >= 13 && pan.length() <= 16){
            if (pan.charAt(0) == '4') {
                this.cardType = CardType.VISACARD;
            } else if (pan.charAt(0) == '5' && pan.charAt(1) == '3'){
                this.cardType = CardType.MASTERCARD;
            } else if (pan.charAt(0) == '5' && pan.charAt(1) == '0' || pan.charAt(1) == '1'){
                this.cardType = CardType.VERVE;
            } else if (pan.charAt(0) == '3' && pan.charAt(1) == '7'){
                this.cardType = CardType.AMERICAEXPRESS;
            }
        }
        return cardType;
    }

    private String validateCreditCard(){
        String pan = "";
        if (cardNumber != null) pan = cardNumber.replaceAll("\\s+", "");

        int sumOfEven = 0;
        int sumOfOdd = 0;
        try{
            for(int index = pan.length() - 1; index >= 0; index--){
                sumOfOdd += Integer.parseInt(String.valueOf(pan.charAt(index)));
                if (index > 0) index -= 1;

                int multiple = Integer.parseInt(String.valueOf(pan.charAt(index))) * 2;
                if (multiple > 9){
                    int firstDigit = multiple / 10;
                    int secondDigit =  multiple % 10;
                    sumOfEven += (firstDigit + secondDigit);
                } else {  sumOfEven += multiple;  }
            }
        } catch (InvalidCardException _){
        }
        int total = sumOfEven + sumOfOdd;
        this.cardNumber = (total % 10 == 0 && total != 0) ? pan : "Invalid";
        return pan;
    }

    public String getCardName() {
        return name;
    }

    public String getCardNumber() {
        return validateCreditCard();
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

    public CardType getCardType() {
        return validateCardType();
    }
}