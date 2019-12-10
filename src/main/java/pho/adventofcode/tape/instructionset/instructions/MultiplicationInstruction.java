package pho.adventofcode.tape.instructionset.instructions;

import pho.adventofcode.tape.instructionset.Instruction;

public class MultiplicationInstruction extends Instruction {

    private static final int MULTIPLICATION_OPERATION = 2;

    @Override
    public int execute(int code, int parameter1, int parameter2) {
        return (code == MULTIPLICATION_OPERATION) ?
                parameter1 * parameter2 :
                null;
    }

}