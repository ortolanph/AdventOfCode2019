package pho.adventofcode.tape;

import pho.adventofcode.tape.instructionset.instructions.AdditionInstruction;
import pho.adventofcode.tape.instructionset.instructions.MultiplicationInstruction;
import pho.adventofcode.tape.instructionset.Instruction;

public final class InstructionChainCreator {

    private InstructionChainCreator() {
    }

    public static Instruction chain() {
        Instruction instruction = new AdditionInstruction();
        instruction.setNext(new MultiplicationInstruction());
        return instruction;
    }

}