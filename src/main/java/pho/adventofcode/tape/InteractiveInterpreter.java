package pho.adventofcode.tape;

import pho.adventofcode.tape.debug.DebugInfo;
import pho.adventofcode.tape.debug.ParameterValue;
import pho.adventofcode.tape.instructionset.Instruction;

import java.util.Iterator;

public class InteractiveInterpreter implements Iterator<DebugInfo> {
    private static final int END_PROGRAM = 99;

    private int[] tape;
    private Instruction chain;
    private int pointer;
    private boolean ended;

    public InteractiveInterpreter(int[] tape) {
        this.tape = tape;
        this.chain = InstructionChainCreator.chain();
    }

    public boolean hasNext() {
        return ended;
    }

    public DebugInfo next() {
        int command = tape[pointer];

        if (command == END_PROGRAM) {
            ended = true;
            return DebugInfo.debugInfo(
                    ParameterValue.total(tape[pointer]),
                    (true)? null : null,
                    (true)? null : null,
                    0);
        }

        int param1 = tape[tape[pointer + 1]];
        int param2 = tape[tape[pointer + 2]];
        int saveTo = tape[pointer + 3];

        tape[saveTo] = chain.execute(command, param1, param2);

        DebugInfo debugInfo = DebugInfo.debugInfo(
                ParameterValue.buildParameter(tape[pointer + 1], tape[tape[pointer + 1]]),
                ParameterValue.buildParameter(tape[pointer + 2], tape[tape[pointer + 2]]),
                ParameterValue.buildParameter(tape[pointer + 3], tape[tape[pointer + 3]]),
                tape[saveTo]
        );

        pointer += 4;

        return debugInfo;
    }

    private boolean existPosition(int pointerPosition) {
        return pointerPosition >= tape.length;
    }

}