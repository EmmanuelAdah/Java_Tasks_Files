package phoneBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Name {
    private String firstName;
    private String lastName;
    private boolean isEmpty;
    private List<Contact> contacts = new ArrayList<>();

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean isEmpty() {
        return this.isEmpty = contacts.isEmpty();
    }

    public void addContact(String address, long telephone, String email) {
        this.contacts.add(new Contact(address, telephone, email));
    }

    public String findContactByPhoneNumber(long phone) {
        for (Contact contact : this.contacts) {
            if (Objects.equals(phone, contact.getPhoneNumber())) {
                return String.valueOf(contact);
            }
        } return String.format("%s", phone);
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String toString() {
        return String.format("First Name: %s Last Name: %s", this.firstName, this.lastName);
    }

    public String getLastName() {
        return this.lastName;
    }
}
