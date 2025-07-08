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

    @Test
    public void popItemFromListTest() {
        list.addItemToList(3);
        list.addItemToList(7);
        list.removeItemFromList(7);
        assertEquals(1, list.getCount());
    }

    @Test
    public void listUnderFlowTest() {
        assertThrows(ListUnderFlowException.class, () -> list.removeItemFromList(7));
    }

    @Test
    public void addItemToFullListTest() {
        list.addItemToList(3);
        list.addItemToList(7);
        list.addItemToList(3);
        assertThrows(ListOverFlowException.class, ()-> list.addItemToList(3));
    }
}
