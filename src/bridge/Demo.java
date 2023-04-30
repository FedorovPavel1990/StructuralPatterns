package bridge;

import bridge.detail.ComplicatedDetail;
import bridge.detail.Detail;
import bridge.detail.SimpleDetail;
import bridge.detail.material.Metal;
import bridge.detail.material.Wood;

public class Demo {

    public static void main(String[] args) {
        // Сначала все детали делались из одного материала
        Detail simpleDetail = new SimpleDetail(1);
        Detail complicatedDetail = new ComplicatedDetail(4);

        // Затем понадобилось делать детали из разных материалов, и вместо того, чтобы добавлять классы
        // SimpleWoodenDetail, SimpleMetalDetail, ComplicatedWoodenDetail и ComplicatedMetalDetail были добавлены
        // классы в пакете material и в Detail добавлено поле типа Material
        Detail simpleWoodenDetail = new SimpleDetail(2, new Wood(5));
        Detail complicatedMetalDetail = new ComplicatedDetail(5, new Metal(9));
    }

}
