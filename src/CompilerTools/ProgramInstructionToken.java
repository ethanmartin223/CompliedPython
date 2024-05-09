package CompilerTools;

public class ProgramInstructionToken {

    boolean isArgument;
    boolean isFunction;
    boolean isData; //str, int, etc.
    String tokenInstruction;

    public ProgramInstructionToken(String token) {
        this.tokenInstruction = token;
    }
}
