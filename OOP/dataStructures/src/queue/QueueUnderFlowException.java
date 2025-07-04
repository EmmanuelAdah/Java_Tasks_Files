package queue;

public class QueueUnderFlowException extends RuntimeException{
    public QueueUnderFlowException(String message) {
        super(message);
    }
}
