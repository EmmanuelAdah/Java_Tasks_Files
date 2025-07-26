package phoneBook;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PhoneBookTest {
    PhoneBook contacts = new PhoneBook();

    @Test
    public void contactListIsEmptyTest(){
        assertTrue(contacts.getContactList().isEmpty());
    }

    @Test
    public void contactListIsNotEmptyTest(){
        contacts.addContact("Emma", "Adah", "No 2, Sabo-Yaba", "09073463473", "edo@gmail.com");
        assertFalse(contacts.getContactList().isEmpty());
    }


    @Test
    public void addInvalidContactTest(){
        assertThrows(InvalidNameFormatException.class, () -> contacts.addContact("Emma007",
                "Adah", "No 2, Sabo-Yaba", "09073463473", "edo@gmail.com"));
    }

    @Test
    public void addInvalidPhoneNumberTest(){
        assertThrows(InvalidNumberFormatException.class, () -> contacts.addContact("Emma",
                "Adah", "No 2, Sabo-Yaba", "090898776uh", "edo@gmail.com"));
    }

    @Test
    public void findContactByFirstNameTest(){
        contacts.addContact("John", "Chi", "No 32, Sabo", "09078776656", "uquwiqwquiw");
        contacts.addContact("Jan", "Doe", "No 13, yaba", "09178776656", "hjjk");
        assertEquals(String.format("First Name: %s %nLast Name: %s %nAddress: %s %nPhone Number: %s %nEmail: %s%n",
                "Jan", "Doe", "No 13, yaba", "09178776656", "hjjk"), contacts.findContactByFirstName("Jan"));
    }

    @Test
    public void findContactByLastNameTest(){
        contacts.addContact("Emma", "Adah", "No 32, Sabo", "09078776656", "uquwiqwquiw");
        contacts.addContact("John", "Chi", "No 13, yaba", "09178776656", "hjjk");
        assertEquals(contacts.findContactByLastName("Chi"), String.format("First Name: %s %nLast Name: %s %nAddress: " +
                        "%s %nPhone Number: %s %nEmail: %s%n", "John", "Chi", "No 13, yaba", "09178776656", "hjjk"));
    }

    @Test
    public void deleteContactFromListTest(){
        contacts.addContact("emma", "adah", "No 13, Sabo", "09178926656", "uquwiqwquiw");
        contacts.deleteContact("emma", "adah", "09178926656");
        assertTrue(contacts.getContactList().isEmpty());
    }

    @Test
    public void findContactByPhoneNumberTest(){
        contacts.addContact("emma", "adah", "No 13, Sabo", "09430034994", "uquwiqwquiw");
        contacts.addContact("John", "chi", "yu", "09178926656", "chi@gmail.com");
        assertEquals(String.format("First Name: %s %nLast Name: %s %nAddress: %s %nPhone Number: %s %nEmail: %s%n", "John",
                "chi", "yu", "09178926656", "chi@gmail.com"), contacts.findContactByPhoneNumber("09178926656"));
    }

    @Test
    public void contactUpdateTest(){
        contacts.addContact("emma", "adah", "No 13, Sabo", "09430034994", "uquwiqwquiw");
        contacts.updateContact(0, "Emma", "Adah", "No 13, Sabo", "09430034994", "edo");
        assertEquals(String.format("First Name: %s %nLast Name: %s %nAddress: %s %nPhone Number: %s %nEmail: %s%n",
                "Emma", "Adah", "No 13, Sabo", "09430034994", "edo"), contacts.findContactByPhoneNumber("09430034994"));
    }
}