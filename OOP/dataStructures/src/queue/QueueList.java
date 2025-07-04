package queue;

public class QueueList {
    private boolean state;
    private int size;
    private String[] que = new String[4];

    public void addItemToQueue(String item) {
        if(size > que.length) {
            throw new QueueOverFlowException("Queue is full");
        } else { que[size++] = item;  state = (size > 0); }
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
            if (size == 0) throw new QueueUnderFlowException("Queue is empty");
        }
    }
}
