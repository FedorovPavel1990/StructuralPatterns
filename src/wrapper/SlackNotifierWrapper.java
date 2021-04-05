package wrapper;

public class SlackNotifierWrapper extends BaseNotifierWrapper {

    private final String account;

    public SlackNotifierWrapper(NotifierWrapperInterface notifier, String account) {
        super(notifier);
        this.account = account;
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.printf("Отправляю сообщение в Slack пользователю %s: %s\n", account, message);
    }

}