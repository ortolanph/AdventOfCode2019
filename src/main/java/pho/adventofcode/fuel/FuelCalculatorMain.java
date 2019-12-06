package pho.adventofcode.fuel;

import pho.adventofcode.exceptions.AdventOfCodeException;

public class FuelCalculatorMain {
    public static void main(String[] args) {
        try {
            double total = FuelCalculator
                .calculateForAllCompartiments("inputs/day1a.txt");

            System.out.println(total);
        } catch(AdventOfCodeException exception) {
            exception.printStackTrace();
        }
    }
}