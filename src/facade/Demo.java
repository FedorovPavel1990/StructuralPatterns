package facade;

public class Demo {

    public static void main(String[] args) {
        Pilaf pilaf = new Pilaf();
        PilafFacade pilafFacade = new PilafFacade(pilaf);
        pilafFacade.cook();
    }
}
