package wrapper;

public class Notifier implements NotifierWrapperInterface {

    @Override
    public void send(String message) {
        System.out.printf("Отправляю сообщение: %s\n", message);
    }

}
