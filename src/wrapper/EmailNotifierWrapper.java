package wrapper;

public class EmailNotifierWrapper extends BaseNotifierWrapper {

    private final String email;

    public EmailNotifierWrapper(NotifierWrapperInterface notifier, String email) {
        super(notifier);
        this.email = email;
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.printf("Отправляю email-сообщение на почту %s: %s\n" , email, message);
    }

}
