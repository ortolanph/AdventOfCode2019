package pho.adventofcode.fuel;

public class FuelCalculator {
    public double calculate(long total) {
        return Math.floor(total / 3) -2;
    }
}
