package proxy;

public class Service implements ServiceInterface {

    @Override
    public void someOperation() {
        System.out.println("Выполняется что-то важное");
    }

}
