package adapter;

import adapter.adapter.RoundPegAdapter;
import adapter.hole.SquareHole;
import adapter.peg.RoundPeg;
import adapter.peg.SquarePeg;

/**
 * Допутим был функционал по проверке вписывается ли квадратный колышек в квадратное отверстие, нам нужно добавить в
 * этот функционал возможность проверять вписывается ли круглый колышек в квадратное отверстие
 */
public class Demo {

    public static void main(String[] args) {
        SquareHole squareHole = new SquareHole(5);
        SquarePeg squarePeg = new SquarePeg(5);

        isPegFitsIntoHole(squareHole, squarePeg);

        RoundPeg smallRoundPeg = new RoundPeg(2);
        RoundPeg largeRoundPeg = new RoundPeg(3);

        // Делаем RoundPegAdapter, так как на входе метода isPegFitsIntoHole() вторым аргументом должен быть SquarePeg,
        // для этого адаптируем RoundPeg к SquarePeg в классе RoundPegAdapter
        RoundPegAdapter smallRoundPegAdapter = new RoundPegAdapter(smallRoundPeg);
        RoundPegAdapter largeRoundPegAdapter = new RoundPegAdapter(largeRoundPeg);

        isPegFitsIntoHole(squareHole, smallRoundPegAdapter);
        isPegFitsIntoHole(squareHole, largeRoundPegAdapter);
    }

    private static void isPegFitsIntoHole(SquareHole hole, SquarePeg peg) {
        if (hole.fits(peg)) {
            System.out.printf("%s вписывается в квадратное отверстие шириной %d\n", peg.getName(), hole.getWidth());
        } else {
            System.out.printf("%s не вписывается в квадратное отверстие шириной %d\n", peg.getName(), hole.getWidth());
        }
    }

//    Результат работы:
//
//    Квадратный колышек шириной 5 вписывается в квадратное отверстие шириной 5
//    Круглый колышек радиусом 2 вписывается в квадратное отверстие шириной 5
//    Круглый колышек радиусом 3 не вписывается в квадратное отверстие шириной 5

}
