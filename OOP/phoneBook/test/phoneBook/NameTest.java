package phoneBook;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NameTest {
    Name name = new Name("Theo", "Dan");

    @Test
    public void contactListIsEmptyTest(){
        assertTrue(name.isEmpty());
    }
}
