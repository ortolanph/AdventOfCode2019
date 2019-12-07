package pho.adventofcode.fuel;

import java.util.function.ToDoubleFunction;

public class SimpleFuelCalculator implements ToDoubleFunction<Long> {

    @Override
    public double applyAsDouble(Long fuel) {
        return Math.floor(fuel / 3) - 2;
    }

}