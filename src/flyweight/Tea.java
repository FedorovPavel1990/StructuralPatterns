package flyweight;

public class Tea {
    private final String type;

    public Tea(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Чай " + type;
    }
}
