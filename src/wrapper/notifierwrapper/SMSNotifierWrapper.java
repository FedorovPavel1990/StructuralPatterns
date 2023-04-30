package wrapper.notifierwrapper;

import wrapper.Notifier;

public class SMSNotifierWrapper extends BaseNotifierWrapper {

    private final String phone;

    public SMSNotifierWrapper(Notifier notifier, String phone) {
        super(notifier);
        this.phone = phone;
    }

    @Override
    public void send(String message) {
        notifier.send(message);
        System.out.printf("Отправляю SMS-сообщение на номер %s: %s\n", phone, message);
    }

}
