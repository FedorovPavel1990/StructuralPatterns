package wrapper.notifierwrapper;

import wrapper.Notifier;

public class EmailNotifierWrapper extends BaseNotifierWrapper {

    private final String email;

    public EmailNotifierWrapper(Notifier notifier, String email) {
        super(notifier);
        this.email = email;
    }

    @Override
    public void send(String message) {
        notifier.send(message);
        System.out.printf("Отправляю email-сообщение на почту %s: %s\n" , email, message);
    }

}
