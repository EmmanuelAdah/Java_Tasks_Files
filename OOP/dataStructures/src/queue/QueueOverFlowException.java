package queue;

public class QueueOverFlowException extends RuntimeException{
    public QueueOverFlowException(String message) {
        super(message);
    }
}
