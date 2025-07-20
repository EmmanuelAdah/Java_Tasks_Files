package phoneBook;

public class Contact {
    private String address;
    private String phoneNumber;
    private String email;

    public Contact(String address, String phone, String email) {
        this.address = address;
        validatePhoneNumber(phone);
        this.phoneNumber = phone;
        this.email = email;
    }

    private void validatePhoneNumber(String phone) {
        for (char number : phone.toCharArray())
            if (!Character.isDigit(number)) throw new InvalidNumberFormatException ("Phone number contains other characters");
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public String toString(){
        return String.format("Address: %s %nPhone Number: %s %nEmail: %s%n", this.getAddress(), this.getPhoneNumber(), this.getEmail());
    }
}