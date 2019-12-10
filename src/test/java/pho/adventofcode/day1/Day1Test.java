package pho.adventofcode.day1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import pho.adventofcode.fuel.MassFuelCalculator;
import pho.adventofcode.fuel.SimpleFuelCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day1Test {

    @ParameterizedTest
    @DisplayName("Fuel calculator for given data")
    @CsvSource({"12,2.0", "14,2.0", "1969,654.0", "100756,33583.0"})
    public void shouldCalculateFuel(long input, double expected) {
        SimpleFuelCalculator simpleFuelCalculator = new SimpleFuelCalculator();
        double actual = simpleFuelCalculator.applyAsDouble(input);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @DisplayName("Mass fuel calculator for given data")
    @CsvSource({"14,2.0", "1969,966.0", "100756,50346.0"})
    public void shouldCalculateMassFuel(long input, double expected) {
        MassFuelCalculator massFuelCalculator = new MassFuelCalculator();
        double actual = massFuelCalculator.applyAsDouble(input);
        assertEquals(expected, actual);
    }
}
