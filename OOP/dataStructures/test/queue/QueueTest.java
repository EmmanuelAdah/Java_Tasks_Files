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
    public void removeItemFromQueueTest(){
        queue.addItemToQueue("Emma");
        queue.addItemToQueue("Kels");
        queue.removeQueueItem("Kels");

        assertEquals(1, queue.getQueueSize());
    }

    @Test
    public void queueOverFlowExceptionTest(){
        assertThrows(QueueUnderFlowException.class, () -> queue.removeQueueItem("Emma"));
    }

    @Test
    public void queueUnderFlowExceptionTest(){
        queue.addItemToQueue("Emma");
        queue.addItemToQueue("Kels");
        queue.addItemToQueue("Emma");
        queue.addItemToQueue("Kels");
        assertThrows(QueueOverFlowException.class, () -> queue.addItemToQueue("Emma"));
    }
}