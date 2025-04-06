public class AppRunner {
    private final MessageService messageService;

    public AppRunner(MessageService messageService) {
        this.messageService = messageService;
    }

    public void run() {
        messageService.send("გამარჯობა Java აპიდან!");
    }
}
