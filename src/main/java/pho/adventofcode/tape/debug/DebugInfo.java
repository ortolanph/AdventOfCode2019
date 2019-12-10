package pho.adventofcode.tape.debug;

import java.lang.reflect.Parameter;

public final class DebugInfo {
    private static final String TO_STRING_TEMPLATE = "[Parameter1: %s, Parameter2: %s, Parameter3: %s, result: %20d, (100 * noun + verb): %20d]%n";

    private final ParameterValue parameter1;
    private final ParameterValue parameter2;
    private final ParameterValue parameter3;
    private final int result;

    private DebugInfo(ParameterValue parameter1, ParameterValue parameter2, ParameterValue parameter3, int result) {
        this.parameter1 = parameter1;
        this.parameter2 = parameter3;
        this.parameter3 = parameter3;
        this.result = result;
    }

    public static DebugInfo debugInfo(ParameterValue parameter1, ParameterValue parameter2, ParameterValue parameter3, int result) {
        return new DebugInfo(parameter1, parameter2, parameter3, result);
    }

    public ParameterValue getParameter1() {
        return parameter1;
    }

    public ParameterValue getParameter2() {
        return parameter2;
    }

    public ParameterValue getParameter3() {
        return parameter3;
    }

    public int getResult() {
        return result;
    }

    public int calculateNounVerb() {
        return (100 * parameter1.getReference()) + parameter2.getReference();
    }

    @Override
    public String toString() {
        return String.format(TO_STRING_TEMPLATE,
                parameter1.toString(),
                parameter2.toString(),
                parameter3.toString(),
                result,
                calculateNounVerb());
    }
}
