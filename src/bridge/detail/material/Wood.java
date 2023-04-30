package bridge.detail.material;

public class Wood extends Material {

    private final Integer hardness;

    public Wood(Integer hardness) {
        super("Дерево");
        this.hardness = hardness;
    }

    public Integer getHardness() {
        return hardness;
    }
}
