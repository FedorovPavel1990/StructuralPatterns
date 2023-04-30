package wrapper.notifierwrapper;

import wrapper.Notifier;

public class TiMeNotifierWrapper extends BaseNotifierWrapper {

    private final String account;

    public TiMeNotifierWrapper(Notifier notifier, String account) {
        super(notifier);
        this.account = account;
    }

    @Override
    public void send(String message) {
        notifier.send(message);
        System.out.printf("Отправляю сообщение в TiMe пользователю %s: %s\n", account, message);
    }

}