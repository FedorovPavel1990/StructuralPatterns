package wrapper;

public class BaseNotifierWrapper implements NotifierWrapperInterface {

    private final NotifierWrapperInterface notifier;

    public BaseNotifierWrapper(NotifierWrapperInterface notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send(String message) {
        notifier.send(message);
    }
}
