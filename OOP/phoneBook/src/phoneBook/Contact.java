package phoneBook;

public class Contact {
    private String address;
    private String phoneNumber;
    private String email;

    public Contact(String address, String phoneNumber, String email) {
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String toString(){
        return String.format("Address: %s %nPhone Number: %s %nEmail: %s", this.address, this.phoneNumber, this.email);
    }
}
