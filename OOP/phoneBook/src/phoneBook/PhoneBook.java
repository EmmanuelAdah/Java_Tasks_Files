package phoneBook;

import java.util.ArrayList;
import java.util.List;


public class PhoneBook {
    private List<Contact> contacts = new ArrayList<>();

    public void addContact(String firstName, String lastName, String address, String telephone, String email) {
        this.contacts.add(new Contact(firstName, lastName, address, telephone, email));
    }

    public void deleteContact(String firstName, String lastName, String phoneNumber) {
        boolean found = false;
        for (Contact contact : this.contacts) {
            if (contact.getFirstName().equalsIgnoreCase(firstName) && contact.getLastName().equalsIgnoreCase(lastName)
                    && contact.getPhoneNumber().equals(phoneNumber)) {
                this.contacts.remove(contact);
                found = true;
            }
            if (found) break;
        }
    }

    public String findContactByPhoneNumber(String phone) {
        for (Contact contact : this.contacts)
            if (contact.getPhoneNumber().equals(phone)) return String.valueOf(contact);
        return String.format("Contact not found");
    }

    public String findContactByFirstName(String name) {
        for (Contact contact : this.contacts)
            if (contact.getFirstName().equalsIgnoreCase(name)) return String.valueOf(contact);
        return String.format("No match for %s in contact list", name);
    }

    public String findContactByLastName(String name) {
        for (Contact contact : this.contacts)
            if (contact.getLastName().equalsIgnoreCase(name)) return String.valueOf(contact);
        return String.format("No match for %s in contact list", name);
    }

    public void updateContact(int count, String firstName, String lastName, String address, String phoneNumber, String email) {
        this.contacts.set(count, new Contact(firstName, lastName, address, phoneNumber, email));
    }

    public List<Contact> getContactList(){
        return this.contacts;
    }
}