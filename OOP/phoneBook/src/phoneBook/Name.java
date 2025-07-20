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

    public void addContact(String address, String telephone, String email) {
        this.contacts.add(new Contact(address, telephone, email));
    }

    public String findContactByPhoneNumber(String phone) {
        for (Contact contact : this.contacts)
            if (contact.getPhoneNumber() == phone) return String.valueOf(contact);
        return null;
    }

    public void deleteContactByPhoneNumber(String phone) {
        boolean found = false;
        for (Contact contact : this.contacts) {
            if (Objects.equals(phone, contact.getPhoneNumber())) {
                this.contacts.remove(contact);
                found = true;
            }
            if (found) break; else System.out.println("Contact not found");
        }
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String toString() {
        return String.format("First Name: %s Last Name: %s", this.firstName, this.lastName);
    }
}
