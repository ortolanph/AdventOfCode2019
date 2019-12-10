package pho.adventofcode.tape.instructionset;

public abstract class Instruction {

    private Instruction next;

    public Instruction getNext() {
        return this.next;
    }

    public void setNext(Instruction next) {
        this.next = next;
    }

    public abstract int execute(int code, int parameter1, int parameter2);

}