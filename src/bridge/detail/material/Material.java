package bridge.detail.material;

public abstract class Material {

    private final String name;

    public Material(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
