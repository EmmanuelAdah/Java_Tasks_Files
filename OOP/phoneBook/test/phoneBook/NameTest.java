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
}
