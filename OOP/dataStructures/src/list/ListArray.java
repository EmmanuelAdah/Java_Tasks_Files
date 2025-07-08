package list;

import java.util.Objects;

public class ListArray {
    private int[] list = new int[3];
    private boolean listSize;
    private int count;

    public int[] getList() {
        return list;
    }

    public boolean getListSize() {
        return listSize;
    }

    public void addItemToList(int item) {
        if (Objects.equals(count, list.length)) throw new ListOverFlowException("List is Full");
        this.list[count++] = item;
        this.listSize = true;
    }

    public int getCount() {
        return this.count;
    }

    public void removeItemFromList(int item) {
        if (Objects.equals(count, 0)) throw new ListUnderFlowException("List is empty");
        list[count--] = 0;
    }
}
