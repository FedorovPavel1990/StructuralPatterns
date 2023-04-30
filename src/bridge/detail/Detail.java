package bridge.detail;

import bridge.detail.material.Material;

public abstract class Detail {

    private final String name;
    private final Integer size;
    private Material material;

    protected Detail(String name, Integer size) {
        this.name = name;
        this.size = size;
    }

    protected Detail(String name, Integer size, Material material) {
        this(name, size);
        this.material = material;
    }

    public String getName() {
        return name;
    }

    public Integer getSize() {
        return size;
    }

    public Material getMaterial() {
        return material;
    }

}