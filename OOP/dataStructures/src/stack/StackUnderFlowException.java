package stack;

public class StackUnderFlowException extends RuntimeException {
    public StackUnderFlowException(String message) {
        super("stack is empty");
    }
}
