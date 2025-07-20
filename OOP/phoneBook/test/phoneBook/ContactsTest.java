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
    public void findContactByFirstNameTest(){
        contacts.addName("John", "Chi");
        contacts.addName("Jan", "Doe");
        assertEquals("First Name: Jan Last Name: Doe", contacts.findContactByFirstName("Jan"));
    }

    @Test
    public void findContactByLastNameTest(){
        contacts.addName("Emma", "Adah");
        contacts.addName("John", "Chi");
        assertEquals("First Name: John Last Name: Chi", contacts.findContactByLastName("Chi"));
    }
}