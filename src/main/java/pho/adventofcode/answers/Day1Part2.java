package pho.adventofcode.answers;

import java.io.IOException;

import pho.adventofcode.fuel.FuelCalculator;
import pho.adventofcode.fuel.MassFuelCalculator;
import pho.adventofcode.utils.FileUtils;

public class Day1Part2 {

    public static void main(String[] args) {
        try {
            double total = FuelCalculator
                .calculateFuel(FileUtils.loadLong(args[0]), new MassFuelCalculator());
            System.out.println(total);
        } catch(IOException exception) {
            exception.printStackTrace();
        }
    }

}