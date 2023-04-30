package adapter.adapter;

import adapter.peg.RoundPeg;
import adapter.peg.SquarePeg;

/**
 * Адаптируем RoundPeg к SquarePeg
 */
public class RoundPegSquareAdapter extends SquarePeg {

    private final RoundPeg roundPeg;

    public RoundPegSquareAdapter(RoundPeg roundPeg) {
        super(roundPeg.getRadius() * 2);
        this.roundPeg = roundPeg;
    }

    @Override
    public String getName() {
        return roundPeg.getName();
    }
}
