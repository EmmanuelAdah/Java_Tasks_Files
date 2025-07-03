package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueList {
    private Queue<String> que = new LinkedList<>();
    private boolean state;
    private int size;

    public void addItemToQueue(String item) {
        que.add(item);
        size++;
        state = (size > 0);
    }

    public boolean getIsEmpty() {
        return state;
    }

    public Queue<String> getQueueItems() {
        return que;
    }

    public int getQueueSize() {
        return size;
    }

    public void removeQueueItem(String item) {
        que.poll();
        size--;
    }
}
