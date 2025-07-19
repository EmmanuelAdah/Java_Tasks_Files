package phoneBook;

public class Contact {
    private String address;
    private long phoneNumber;
    private String email;

    public Contact(String address, long phoneNumber, String email) {
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

    public long getPhoneNumber() {
        return this.phoneNumber;
    }
}
