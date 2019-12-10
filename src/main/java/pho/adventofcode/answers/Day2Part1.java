package pho.adventofcode.answers;

import pho.adventofcode.tape.TapeInterpreter;
import pho.adventofcode.utils.FileUtils;

import java.io.IOException;
import java.util.Arrays;

public class Day2Part1 {

    public static void main(String[] args) {
        try {
            int[] tape =
                    Arrays
                            .stream(FileUtils.loadArrayInList(args[0]).get(0))
                            .mapToInt(Integer::parseInt)
                            .toArray();

            System.out.println(TapeInterpreter.interpret(tape)[0]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}