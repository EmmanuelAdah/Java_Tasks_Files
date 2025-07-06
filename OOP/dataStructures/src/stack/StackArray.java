package stack;

public class StackArray {
    private boolean state;
    private int[] stack = new int[4];
    private int size;

    public void setState() {
        this.state = (stack[0] != 0);
    }

    public boolean getState() {
        return state;
    }

    public void add_item(int item) {
        this.stack[size++] = item;
    }

    public int getStack() {
        return stack[0];
    }

    public void removeItemFromStack(int item) {
        if (size == 0) throw new StackUnderFlowException();
        stack[--size] = 0;
    }
}
