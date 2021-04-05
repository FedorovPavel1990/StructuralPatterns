package wrapper;

public class SMSNotifierWrapper extends BaseNotifierWrapper {

    private final String phone;

    public SMSNotifierWrapper(NotifierWrapperInterface notifier, String phone) {
        super(notifier);
        this.phone = phone;
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.printf("Отправляю SMS-сообщение на номер %s: %s\n", phone, message);
    }

}
