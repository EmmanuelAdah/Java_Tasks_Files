package phoneBook;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NameTest {
    Name name = new Name("Theo", "Dan");

    @Test
    public void contactListIsEmptyTest(){
        assertTrue(name.isEmpty());
    }

    @Test
    public void contactListIsNotEmptyTest(){
        name.addContact("No 2, Sabo-Yaba", "09073463473", "edo@gmail.com");
        assertFalse(name.isEmpty());
    }

    @Test
    public void invalidPhoneNumberTest(){
        assertThrows(InvalidNumberFormatException.class, () -> name.addContact("Theo", "090734634hf", "Dan"));
    }

    @Test
    public void findContactByPhoneNumberTest(){
        name.addContact("No 13, Sabo", "09430034994", "uquwiqwquiw");
        name.addContact("John", "090", "chi@gmail.com");
        assertEquals(String.format("Address: %s %nPhone Number: %s %nEmail: %s%n", "John", "090", "chi@gmail.com"),
                name.findContactByPhoneNumber("090"));
    }

    @Test
    public void deletingContactByPhoneNumberTest(){
        name.addContact("John", "090", "chi@gmail.com");
        name.deleteContactByPhoneNumber("090");
        assertTrue(name.isEmpty());
    }
}