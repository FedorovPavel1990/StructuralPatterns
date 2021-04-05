package adapter;

public class SquareHole {

    private final int width;

    public SquareHole(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public boolean fits(SquarePeg peg) {
        return (this.getWidth() >= peg.getWidth());
    }

}
