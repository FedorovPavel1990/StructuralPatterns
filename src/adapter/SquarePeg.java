package adapter;

public class SquarePeg {

    private int width;
    private String name;

    public SquarePeg(int width) {
        this.width = width;
        this.name = "Квадратный колышек шириной " + width;
    }

    public SquarePeg() {}

    public int getWidth() {
        return width;
    }

    public String getName() {
        return name;
    }
}
