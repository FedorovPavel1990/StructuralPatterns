package wrapper.notifierwrapper;

import wrapper.Notifier;

public class BaseNotifierWrapper extends Notifier {

    protected final Notifier notifier;

    public BaseNotifierWrapper(Notifier notifier) {
        this.notifier = notifier;
    }

}
