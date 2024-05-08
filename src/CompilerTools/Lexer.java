package CompilerTools;

public class Lexer {

    ProgramTree outputTree;

    public Lexer() {
        outputTree = new ProgramTree();
    }

    public void parseLine(String data) {
        System.out.println(data);
    }

    public ProgramTree getProgramTree() {
        return outputTree;
    }
}
