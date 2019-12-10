package pho.adventofcode.tape.debug;

public final class ParameterValue {
    private static final String TO_STRING_TEMPLATE = "[%20d, %20d]";

    private final int reference;
    private final int value;

    private ParameterValue(int reference, int value) {
        this.reference = reference;
        this.value = value;
    }

    public static ParameterValue buildParameter(int reference, int value) {
        return new ParameterValue(reference, value);
    }

    public static ParameterValue total(int total) {
        return new ParameterValue(total,0);
    }

    public static ParameterValue zero() {
        return new ParameterValue(0,0);
    }

    public int getReference() {
        return reference;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.format(TO_STRING_TEMPLATE, reference, value);
    }
}
