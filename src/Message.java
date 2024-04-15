import java.io.Serializable;
import java.time.LocalDateTime;

public class Message implements Serializable {
    private final LocalDateTime time;
    private final String message;
    private final String sender;

    public Message(String message, String sender) {
        this.time = LocalDateTime.now();
        this.message = message;
        this.sender = sender;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public String getMessage() {
        return message;
    }

    public String getSender() {
        return sender;
    }

}
