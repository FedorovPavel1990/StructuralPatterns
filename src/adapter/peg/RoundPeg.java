package adapter.peg;

public class RoundPeg extends Peg {

    private final int radius;

    public RoundPeg(int radius) {
        super("Круглый колышек радиусом " + radius);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

}
