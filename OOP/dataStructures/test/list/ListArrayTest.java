package list;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ListArrayTest {
    ListArray list = new ListArray();

    @Test
    public void listIsEmptyTest() {
        assertFalse(list.getListSize());
    }

    @Test
    public void listIsNotEmptyTest() {
        list.addItemToList(3);
        assertTrue(list.getListSize());
    }

    @Test
    public void addItemToListTest() {
        list.addItemToList(3);
        list.addItemToList(4);
        assertEquals(2, list.getCount());
    }
}
