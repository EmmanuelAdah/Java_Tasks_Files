package phoneBook;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Contact {
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;
    private String email;

    public Contact(String firstName, String lastName, String address, String phone, String email) {
        validateName(firstName);
        this.firstName = firstName;
        validateName(lastName);
        this.lastName = lastName;
        this.address = address;
        validatePhoneNumber(phone);
        this.phoneNumber = phone;
        validateEmail(email);
        this.email = email;
    }

    private void validateName(String name) {
        if (name != null) for (char letter : name.toCharArray()) {
            if (!Character.isLetter(letter)) throw new InvalidNameFormatException(name + " contains invalid characters");
        }
    }

    private void validatePhoneNumber(String phone) {
        if (phone != null && phone.length() == 10 || phone.length() == 11 ) {
            for (char number : phone.toCharArray())
                if (!Character.isDigit(number)) throw new InvalidNumberFormatException ("Phone number contains other characters");
        } else {
            throw new InvalidNumberLengthException("Phone number must be 10 or 11 digits");
        }
    }

    private void validateEmail(String email) {
        final String EMAILREGEX = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(EMAILREGEX);
        Matcher matcher = pattern.matcher(email);
        if (matcher.equals(true)) {
            this.email = email;
        } else { throw new InvalidEmailFormatException("Invalid format for email. Try again!...");
        }
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