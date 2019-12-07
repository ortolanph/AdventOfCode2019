package pho.adventofcode.fuel;

import java.util.List;
import java.util.function.ToDoubleFunction;

public final class FuelCalculator {

    private FuelCalculator() {
    }

    public static double calculateFuel(List<Long> parcels, ToDoubleFunction<Long> calculator) {
        double total = 0;

        total = parcels.stream().mapToDouble(calculator).sum();

        return total;
    }

    
}
