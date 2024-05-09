package CompilerTools;

public class Lexer {

    ProgramTree outputTree;

    public Lexer() {
        outputTree = new ProgramTree();
    }

    public void parseLine(String data) {


        String currentWord = "";
        for (int i=0; i<data.length(); i++) {
            int nextChar = data.charAt(i);
            if ((nextChar > 64 && nextChar < 91) || (nextChar > 96 && nextChar < 123)) {
                currentWord += (char)nextChar;
            } else {
                if (!currentWord.isEmpty()) {
                    outputTree.addInstruction(new ProgramInstructionToken(currentWord));
                } else {
                    outputTree.addInstruction(new ProgramInstructionToken(""+(char)nextChar));
                }
                currentWord = "";
            }
        }
    }

    public ProgramTree getProgramTree() {
        return outputTree;
    }
}
