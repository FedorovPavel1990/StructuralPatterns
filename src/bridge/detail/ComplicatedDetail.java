package bridge.detail;

import bridge.detail.material.Material;

public class ComplicatedDetail extends Detail {

    private static final String NAME = "Сложная деталь";

    public ComplicatedDetail(Integer size) {
        super(NAME, size);
    }

    public ComplicatedDetail(Integer size, Material material) {
        super(NAME, size, material);
    }
}
