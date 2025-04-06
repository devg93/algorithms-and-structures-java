public interface MessageService {

    String getMessage(String messageId);
    String getMessage(String messageId, Object... args);
    String getMessage(String messageId, Object[] args, String defaultMessage);
    Boolean isMessagePresent(String messageId);
    void send(String message);


}
