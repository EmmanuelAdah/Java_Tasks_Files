package list;

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
        list[count++] = item;
        listSize = true;
    }

    public int getCount() {
        return count;
    }
}
