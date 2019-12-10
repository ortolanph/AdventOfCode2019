package pho.adventofcode.tape;

import pho.adventofcode.tape.instructionset.Instruction;

public final class TapeInterpreter {
    private static final int END_PROGRAM = 99;

    private TapeInterpreter() {
    }

    public static int[] interpret(int[] tape) {
        int[] answer = tape;

        Instruction chain = InstructionChainCreator.chain();

        for (int i = 0; i < tape.length; i += 4) {
            int command = tape[i];

            if (command == END_PROGRAM) {
                break;
            }

            int param1 = tape[tape[i + 1]];
            int param2 = tape[tape[i + 2]];
            int saveTo = tape[i + 3];

            answer[saveTo] = chain.execute(command, param1, param2);
        }

        return answer;
    }


}