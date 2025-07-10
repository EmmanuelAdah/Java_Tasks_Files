package stack;

public class StackArray {
    private boolean state;
    private int[] stack = new int[3];
    private int size;

    public void setState() {
        this.state = (stack[0] != 0);
    }

    public boolean getState() {
        return state;
    }

    public void add_item(int item) {
        if (size == stack.length) {
            throw new StackOverFlowException("stack is full");
        } this.stack[size++] = item;
    }

    public void removeItemFromStack(int item) {
        if (size == 0) throw new StackUnderFlowException("stack is empty");
        stack[--size] = 0;
    }

    public int getSize() {
        return size;
    }
}
