package Java_Files.OOP;

public class Billing {
    private final String name;
    private final String phoneNumber;
    private CardType cardType;

    public Billing(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName(){
        return name;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }
}

