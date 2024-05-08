package CompilerTools;

import java.util.LinkedList;
import java.util.Queue;

public class ProgramTree {

    Queue<ProgramInstruction> instructions;

    public ProgramTree() {
        instructions = new LinkedList<>();
    }

    public void addInstruction(ProgramInstruction programInstruction) {
        instructions.add(programInstruction);
    }
}
