package queue;

import java.util.Arrays;

public class QueueList {
    private String[] que = new String[4];
    private boolean state;
    private int size;

    public void addItemToQueue(String item) {
        que[size++] = item;
        state = (size > 0);
    }

    public boolean getIsEmpty() {
        return state;
    }

    public String[] getQueueItems() {
        return que;
    }

    public int getQueueSize() {
        return size;
    }

    public void removeQueueItem(String item) {
        for (String name : que) {
            if (item.equalsIgnoreCase(name)) { que[--size] = null; }
        }
    }
}
