package stack;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    StackArray stack = new StackArray();

    @Test
    public void stackIsEmptyTest() {
        assertFalse(stack.getState());
    }



    @Test
    public void itemsCanBeAddedToStackTest() {
        stack.add_item(2);
        assertEquals(1, stack.getSize());
        stack.add_item(6);
        assertEquals(2, stack.getSize());
    }

    @Test
    public void stackIsNotEmptyTest() {
        stack.add_item(2);
        stack.setState();
        assertTrue(stack.getState());
    }

    @Test
    public void itemCanBeRemovedTest() {
        stack.add_item(2);
        stack.add_item(3);
        stack.removeItemFromStack(2);
        assertEquals( 1, stack.getSize());
    }

    @Test
    public void stackUnderFlowExceptionTest() {
        assertThrows(StackUnderFlowException.class, () -> stack.removeItemFromStack(3));
    }

    @Test
    public void stackOverFlowTest() {
        stack.add_item(2);
        stack.add_item(3);
        stack.add_item(7);
        assertThrows(StackOverFlowException.class, () -> stack.add_item(6));
    }
}
