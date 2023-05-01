package flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TeaMaker {
    private final List<Tea> availableTea = new ArrayList<>();

    public Tea make(String teaType) {
        Optional<Tea> optionalTea = availableTea.stream().filter(availableTea -> teaType.equals(availableTea.getType()))
                .findFirst();
        Tea tea;
        if (optionalTea.isEmpty()) {
            tea = new Tea(teaType);
            availableTea.add(tea);
            System.out.printf("Сделали чайник с %s\n", tea);
        } else {
            tea = optionalTea.get();
            System.out.printf("Чайник с %s уже есть\n", tea);
        }
        return tea;
    }

}
