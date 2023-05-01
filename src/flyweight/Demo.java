package flyweight;

public class Demo {
    public static void main(String[] args) {
        TeaMaker teaMaker = new TeaMaker();
        TeaShop teaShop = new TeaShop(teaMaker);

        teaShop.takeOrder("Черный", 1);
        teaShop.takeOrder("Зеленый", 3);
        teaShop.takeOrder("Без сахара", 4);
        teaShop.takeOrder("С молоком", 5);
        teaShop.takeOrder("Черный", 7);
        teaShop.takeOrder("Зеленый", 8);

        teaShop.serve();
    }
}
