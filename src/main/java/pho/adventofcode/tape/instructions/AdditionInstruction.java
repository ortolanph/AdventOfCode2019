package pho.adventofcode.tape.instructions;

import pho.adventofcode.tape.Instruction;

public class AdditionInstruction extends Instruction {

    private static final int ADDITION_OPERATION = 1;

    @Override
    public int execute(int code, int parameter1, int parameter2) {
        return (code == ADDITION_OPERATION)? 
            parameter1 + parameter2 : 
            getNext().execute(code, parameter1, parameter2) ;
    }
    
}