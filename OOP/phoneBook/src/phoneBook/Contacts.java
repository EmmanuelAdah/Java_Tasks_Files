package phoneBook;

import java.util.ArrayList;
import java.util.List;

public class Contacts {
    private List<Name> names = new ArrayList<Name>();

    public void addName(String firstName, String lastName) {
        this.names.add(new Name(firstName,lastName));
    }

    public String findByName(String firstName, String lastName) {
        for (Name name : this.names) {
            if ()
        }
    }
}
