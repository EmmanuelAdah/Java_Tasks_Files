package employee;

public class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setSocialSecurityNumber(String securityNumber) {
        this.socialSecurityNumber = securityNumber;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public String toString() {
        return String.format("First Name: %s %nLast Name: %s %nSocial Security Number: %s%n", getFirstName(), getLastName(), getSocialSecurityNumber());
    }
}