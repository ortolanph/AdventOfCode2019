package pho.adventofcode.fuel;

import java.util.function.ToDoubleFunction;

public class MassFuelCalculator implements ToDoubleFunction<Long> {

    private SimpleFuelCalculator simpleFuelCalculator = new SimpleFuelCalculator();

    @Override
    public double applyAsDouble(Long fuel) {
        return calculateMassForRemainingFuel(0.0, (double)fuel);
    }

    private double calculateMassForRemainingFuel(double accumulator, double remainingFuel) {
        remainingFuel = simpleFuelCalculator.applyAsDouble((long)remainingFuel);
        accumulator += (remainingFuel > 0)? remainingFuel : 0.0;
        
        return (remainingFuel > 2)? calculateMassForRemainingFuel(accumulator, remainingFuel) : accumulator;
    }

}