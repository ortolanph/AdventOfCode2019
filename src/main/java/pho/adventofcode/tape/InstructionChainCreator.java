package pho.adventofcode.tape;

import pho.adventofcode.tape.instructions.AdditionInstruction;
import pho.adventofcode.tape.instructions.MultiplicationInstruction;

public final class InstructionChainCreator {

    private InstructionChainCreator() {}

    public static Instruction chain() {
        Instruction instruction = new AdditionInstruction();
        instruction.setNext(new MultiplicationInstruction());
        return instruction;
    }

}