package queue;

public class QueueList {
    private int size;
    private String[] que = new String[4];

    public void addItemToQueue(String item) {
        if (size == que.length) throw new QueueOverFlowException("Queue is empty");
        que[size++] = item;
    }

    public boolean getIsEmpty() {
        boolean state;
        state = (size > 0);
        return state;
    }

    public String[] getQueueItems() {
        return que;
    }

    public int getQueueSize() {
        return size;
    }

    public void pollQueueItem(String item) {
        for (String name : que) {
            if (size == 0) throw new QueueUnderFlowException("Queue is empty");
            if (item.equalsIgnoreCase(name)) { que[0] = null;
                size--;
            }
        }
    }

    public String peekItemFromList() {
        return que[0];
    }
}
