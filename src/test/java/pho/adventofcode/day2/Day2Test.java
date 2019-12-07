package pho.adventofcode.day2;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import pho.adventofcode.tape.TapeInterpreter;

class Day2Test {

    private static int[] TAPE_1 = {1, 0, 0, 0, 99};

    private static int[] TAPE_2 = {2, 3, 0, 3, 99};

    private static int[] TAPE_3 = {1, 1, 1, 4, 99 ,5 , 6, 0, 99};

    private static int[] TAPE_4 = {1, 9, 10, 3, 2, 3, 11, 0, 99, 30, 40, 50};

    private static int[] TAPE_5 = {1, 0, 0, 3, 99};

    @Test
    @DisplayName("Addition test") 
    public void additionTest() {
        int[] actual = TapeInterpreter.interpret(TAPE_1);
        int[] expected = {2, 0, 0, 0, 99};
        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Multiplication test") 
    public void multiplicationTest() {
        int[] actual = TapeInterpreter.interpret(TAPE_2);
        int[] expected = {2, 3, 0, 6, 99};
        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Example program test") 
    public void exampleProgramTest() {
        int[] actual = TapeInterpreter.interpret(TAPE_3);
        int[] expected = {30, 1, 1, 4, 2, 5, 6, 0, 99};
        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Another example program test") 
    public void anotherExampleProgramTest() {
        int[] actual = TapeInterpreter.interpret(TAPE_4);
        int[] expected = {3500, 9, 10, 70, 2, 3, 11, 0, 99, 30, 40, 50};
        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Yet another example program test") 
    public void yetAnotherExampleProgramTest() {
        int[] actual = TapeInterpreter.interpret(TAPE_5);
        int[] expected = {1, 0, 0, 2, 99};
        assertArrayEquals(expected, actual);
    }
}