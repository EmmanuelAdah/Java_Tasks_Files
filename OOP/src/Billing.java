public class Billing {
    private String name;
    private String phoneNumber;
    private CardType cardType;

    public Billing(String name, String phoneNumber){
        name = name;
        phoneNumber = phoneNumber;
    }

    public String getName(){
        return name;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }
}

