package bridge.detail.material;

public class Metal extends Material {

    private final Integer meltingPoint;

    public Metal(Integer meltingPoint) {
        super("Металл");
        this.meltingPoint = meltingPoint;
    }

    public Integer getMeltingPoint() {
        return meltingPoint;
    }
}
