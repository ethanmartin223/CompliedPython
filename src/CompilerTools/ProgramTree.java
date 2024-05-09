package CompilerTools;

import java.util.LinkedList;
import java.util.Queue;

public class ProgramTree {

    Queue<ProgramInstructionToken> instructions;

    public ProgramTree() {
        instructions = new LinkedList<>();
    }

    public void addInstruction(ProgramInstructionToken programInstructionToken) {
        instructions.add(programInstructionToken);
    }

    public String toString() {
        String output = ""
        return output;
    }
}
