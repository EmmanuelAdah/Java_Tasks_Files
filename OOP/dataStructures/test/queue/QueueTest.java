package queue;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
    QueueList queue = new QueueList();

    @Test
    public void queueIsEmptyTest(){
        assertFalse(queue.getIsEmpty());
    }

    @Test
    public void queueIsNotEmptyTest(){
        queue.addItemToQueue("Emma");
        assertTrue(queue.getIsEmpty());
    }

    @Test
    public void addItemsToQueueTest(){
        queue.addItemToQueue("Emma");
        queue.addItemToQueue("Kels");

        assertEquals(2, queue.getQueueSize());
    }

    @Test
    public void pollItemFromQueueTest(){
        queue.addItemToQueue("Emma");
        queue.addItemToQueue("Kels");
        queue.pollQueueItem("Kels");

        assertEquals(1, queue.getQueueSize());
    }

    @Test
    public void queueOverFlowExceptionTest(){
        assertThrows(QueueUnderFlowException.class, () -> queue.pollQueueItem("Emma"));
    }

    @Test
    public void queueUnderFlowExceptionTest(){
        queue.addItemToQueue("Emma");
        queue.addItemToQueue("Kels");
        queue.addItemToQueue("Emma");
        queue.addItemToQueue("Kels");
        assertThrows(QueueOverFlowException.class, () -> queue.addItemToQueue("Emma"));
    }

    @Test
    public void peekItemFromQueueTest(){
        queue.addItemToQueue("Emma");
        queue.addItemToQueue("Kels");
        assertEquals("Emma", queue.peekItemFromList());
    }
}