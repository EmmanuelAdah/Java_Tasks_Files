package phoneBook;

import java.util.ArrayList;
import java.util.List;

public class Contacts {
    private boolean isEmpty;
    private List<Name> names = new ArrayList<>();

    public void addName(String firstName, String lastName) {
        this.names.add(new Name(firstName,lastName));
    }

    public boolean isEmpty() {
        return this.isEmpty = this.names.isEmpty();
    }

    public String findContactByFirstName(String name) {
        for (Name contact : this.names)
            if (contact.getFirstName().equalsIgnoreCase(name)) return String.valueOf(contact);
        return String.format("No match for %s", name);
    }

    public String findContactByLastName(String name) {
        for (Name contact : this.names)
            if (contact.getLastName().equalsIgnoreCase(name)) return String.valueOf(contact);
        return String.format("No match for %s", name);
    }

    public void deleteContact(String firstName, String lastName) {
        this.names.removeIf(contact ->
                contact.getFirstName().equalsIgnoreCase(firstName) && contact.getLastName().equalsIgnoreCase(lastName));
    }
}
