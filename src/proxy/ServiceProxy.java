package proxy;

import java.util.Random;

public class ServiceProxy implements ServiceInterface {

    private final ServiceInterface service = new Service();

    @Override
    public void someOperation() {
        if (checkAccess()) {
            service.someOperation();
        } else {
            System.out.println("Доступ к операции запрещен");
        }
    }

    private boolean checkAccess() {
        return new Random().nextBoolean();
    }
}
