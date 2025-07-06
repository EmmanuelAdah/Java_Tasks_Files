package stack;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    StackArray stack = new StackArray();

    @Test
    public void test_that_stack_is_empty() {
        assertFalse(stack.getState());
    }

    @Test
    public void test_that_numbers_can_be_added_to_stack() {
        stack.add_item(2);
        assertEquals(2, stack.getStack());
    }

    @Test
    public void test_that_stack_is_not_empty() {
        stack.add_item(2);
        stack.setState();
        assertTrue(stack.getState());
    }

    @Test
    public void itemCanBeRemovedTest() {
        stack.add_item(2);
        stack.add_item(3);
        stack.removeItemFromStack(2);
        assertEquals( 0, stack.getStack());
    }

    @Test
    public void stackUnderFlowExceptionTest() {
        assertThrows(StackUnderFlowException.class, () -> stack.removeItemFromStack(3));
    }
}
