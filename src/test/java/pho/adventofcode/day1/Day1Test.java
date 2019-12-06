package pho.adventofcode.day1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import pho.adventofcode.fuel.FuelCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day1Test {

    @ParameterizedTest
    @DisplayName("Fuel calculator for given data")
    @CsvSource({"12,2.0", "14,2.0", "1969,654.0", "100756,33583.0"})
    public void shouldCalculateFuel(long input, double expected) {
        double actual = FuelCalculator.calculateForCompartiment(input);
        assertEquals(expected, actual);
    }
}
