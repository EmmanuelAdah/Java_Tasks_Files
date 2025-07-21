package phoneBook;

public class Contact {
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;
    private String email;
    private boolean isEmpty;

    public Contact(String firstName, String lastName, String address, String phone, String email) {
        validateName(firstName);
        this.firstName = firstName;
        validateName(lastName);
        this.lastName = lastName;
        this.address = address;
        validatePhoneNumber(phone);
        this.phoneNumber = phone;
        this.email = email;
    }

    private void validateName(String name) {
        if (name == null) {
            for (char letter : name.toCharArray()) {
                if (!Character.isLetter(letter)) {
                    throw new InvalidNameFormatException(name + " contains invalid characters");
                }
            }
        }
    }

    private void validatePhoneNumber(String phone) {
        for (char number : phone.toCharArray())
            if (!Character.isDigit(number)) throw new InvalidNumberFormatException ("Phone number contains other characters");
    }

    public String getLastName() {
    return this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getAddress() {
        return this.address;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getEmail() {
        return this.email;
    }

    public String toString(){
        return String.format("First Name: %s %nLast Name: %s %nAddress: %s %nPhone Number: %s %nEmail: %s%n",
                this.getFirstName(), this.getLastName(), this.getAddress(), this.getPhoneNumber(), this.getEmail());
    }
}