package bridge.detail;

import bridge.detail.material.Material;

public class SimpleDetail extends Detail {

    private static final String NAME = "Простая деталь";

    public SimpleDetail(Integer size) {
        super(NAME, size);
    }

    public SimpleDetail(Integer size, Material material) {
        super(NAME, size, material);
    }
}
