package employee;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        validateName(firstName);
        this.firstName = firstName;
        validateName(lastName);
        this.lastName = lastName;
        validateSecurityNumber(socialSecurityNumber);
        this.socialSecurityNumber = socialSecurityNumber.toUpperCase();
    }

    private void validateName(String name){
        for (Character letter : name.toCharArray()) {
            if (!Character.isLetter(letter)) throw new InvalidNameFormatException (String.format("%s must contain only letters", name));
        }
    }

    private void validateSecurityNumber(String securityNumber){
        for (Character securityID : securityNumber.toCharArray()) {
            if (!Character.isDigit(securityID)) throw new InvalidNumberFormatException("Security number must contain only numbers");
        }
    }

    public void setFirstName(String firstName) {
        validateName(firstName);
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        validateName(lastName);
        this.lastName = lastName;
    }

    public void setSecurityNumber(String securityNumber) {
        validateSecurityNumber(securityNumber);
        this.socialSecurityNumber = securityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public String toString() {
        return String.format("First Name: %s %nLast Name: %s %nSocial Security Number: %s%n", getFirstName(), getLastName(), getSocialSecurityNumber());
    }
}