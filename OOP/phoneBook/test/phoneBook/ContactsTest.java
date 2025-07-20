package phoneBook;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ContactsTest {
    Contacts contacts = new Contacts();

    @Test
    public void contactListIsEmptyTest(){
        assertTrue(contacts.isEmpty());
    }

    @Test
    public void contactListIsNotEmptyTest(){
        contacts.addName("Emma", "Adah");
        assertFalse(contacts.isEmpty());
    }

    @Test
    public void addInvalidContactTest(){
        assertThrows(InvalidNameFormatException.class, () -> contacts.addName("Emma007", "Adah"));
    }

    @Test
    public void findContactByFirstNameTest(){
        contacts.addName("John", "Chi");
        contacts.addName("Jan", "Doe");
        assertEquals("First Name: Jan Last Name: Doe", contacts.findContactByFirstName("Jan"));
    }

    @Test
    public void findContactByLastNameTest(){
        contacts.addName("Emma", "Adah");
        contacts.addName("John", "Chi");
        assertEquals(String.format("First Name: %s %nLast Name: %s%n", "John", "Chi"), contacts.findContactByLastName("Chi"));
    }

    @Test
    public void deleteContactFromListTest(){
        contacts.addName("Emma", "Adah");
        contacts.deleteContact("emma", "adah");
        assertTrue(contacts.isEmpty());
    }
}