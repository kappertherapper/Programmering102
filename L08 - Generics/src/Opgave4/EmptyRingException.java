package Opgave4;

public class EmptyRingException extends RuntimeException{

    public EmptyRingException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmptyRingException(String message) {
        super(message);
    }
}
