package flyweight;

import java.util.HashMap;
import java.util.Map;

public class TeaShop {

    private final Map<Integer, Tea> orders = new HashMap<>();
    private final TeaMaker teaMaker;

    public TeaShop(TeaMaker teaMaker) {
        this.teaMaker = teaMaker;
    }

    public void takeOrder(String teaType, Integer table) {
        orders.put(table, teaMaker.make(teaType));
    }

    public void serve() {
        orders.forEach((table, tea) -> System.out.printf("Несем чашку %s за столик номер %d\n", tea, table));
    }

}
