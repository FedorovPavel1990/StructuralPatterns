package proxy;

public class Demo {

    public static void main(String[] args) {
        // Был сервис, выполняющий какую-то операцию
        Service service = new Service();
        service.someOperation();

        // Нам понадобилось, например, ограничить доступ у этому сервису, для этого делаем ServiceProxy, и подменяем
        // Service на ServiceProxy
        ServiceInterface serviceProxy = new ServiceProxy();
        serviceProxy.someOperation();
    }

}
