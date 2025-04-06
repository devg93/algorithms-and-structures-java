import java.util.Arrays;

public class ConsoleMessageService implements MessageService {

    @Override
    public String getMessage(String messageId) {
        return "Message with ID: " + messageId;
    }

    @Override
    public String getMessage(String messageId, Object... args) {
        return String.format("Message with ID: %s and args: %s", messageId, Arrays.toString(args));
    }

    @Override
    public String getMessage(String messageId, Object[] args, String defaultMessage) {
        return String.format("Message with ID: %s and args: %s. Default: %s", messageId, Arrays.toString(args), defaultMessage);
    }

    @Override
    public Boolean isMessagePresent(String messageId) {
        return true; // Simulating that the message is always present
    }

    @Override
    public void send(String message) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'send'");
    }

}
