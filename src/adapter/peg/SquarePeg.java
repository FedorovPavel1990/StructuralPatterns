package adapter.peg;

public class SquarePeg extends Peg {

    private final int width;

    public SquarePeg(int width) {
        super("Квадратный колышек шириной " + width);
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

}
