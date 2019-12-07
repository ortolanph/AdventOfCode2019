package pho.adventofcode.answers;

import java.io.IOException;

import pho.adventofcode.fuel.FuelCalculator;
import pho.adventofcode.fuel.SimpleFuelCalculator;
import pho.adventofcode.utils.FileUtils;

public class Day1Part1 {
    public static void main(String[] args) {
        try {
            double total = FuelCalculator
                .calculateFuel(FileUtils.loadLong(args[0]), new SimpleFuelCalculator());
            System.out.println(total);
        } catch(IOException exception) {
            exception.printStackTrace();
        }
    }
}