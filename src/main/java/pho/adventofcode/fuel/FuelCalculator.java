package pho.adventofcode.fuel;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import pho.adventofcode.exceptions.AdventOfCodeException;

public final class FuelCalculator {

    private FuelCalculator() {
    }

    public static double calculateForCompartiment(long total) {
        return Math.floor(total / 3) - 2;
    }

    public static double calculateForAllCompartiments(String file) throws AdventOfCodeException {
        double total = 0;
        try {
            total = Files
                        .lines(Paths.get(file))
                        .map(Long::valueOf)
                        .mapToDouble(FuelCalculator::calculateForCompartiment)
                        .sum();
                        
        } catch (IOException e) {
            throw new AdventOfCodeException(1, 1, e);
        }

        return total;
    }
}
