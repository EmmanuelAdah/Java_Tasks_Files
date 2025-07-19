package phoneBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Name {
    private String firstName;
    private String lastName;
    private List<Contact> contacts = new ArrayList<>();

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void addContact(String address, long telephone, String email) {
        this.contacts.add(new Contact(address, telephone, email));
    }

    public Contact findContactByPhoneNumber(long phone) {
        for (Contact contact : this.contacts) {
            if (Objects.equals(phone, contact.getPhoneNumber())) {
                return contact;
            }
        }
        return null;
    }

    public void editContact(String address, long telephone, String email) {
        for (Contact contact : this.contacts) {
            if (findContactByPhoneNumber(phone) )
        }
    }
}
