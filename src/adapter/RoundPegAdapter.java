package adapter;

/**
 * Адаптируем RoundPeg к SquarePeg
 */
public class RoundPegAdapter extends SquarePeg {

    private final RoundPeg roundPeg;

    public RoundPegAdapter(RoundPeg roundPeg) {
        this.roundPeg = roundPeg;
    }

    @Override
    public int getWidth() {
        return roundPeg.getRadius() * 2;
    }

    @Override
    public String getName() {
        return "Круглый колышек радиусом " + roundPeg.getRadius();
    }
}
