import CompilerTools.Lexer;
import CompilerTools.ProgramTree;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Compiler {
    //https://www.freecodecamp.org/news/the-programming-language-pipeline-91d3f449c919/

    private ProgramTree program;
    private String fileName;
    private BufferedReader fileReader;

    public Compiler(String fileName) {
        this.fileName = fileName;
        this.program = new ProgramTree();
    }

    // Returns a BufferedReader for the input filename
    public BufferedReader getFileReader(String fileName) throws IOException {
        return new BufferedReader(new FileReader(fileName));
    }

    // Returns a CompilerTools.ProgramTree object containing CompilerTools.ProgramInstruction's generated from the input reader
    public ProgramTree runLexer(BufferedReader reader) throws IOException {
        ProgramTree outputTree = new ProgramTree();
        Lexer lex = new Lexer();

        while (reader.readLine() != null) {
            outputTree.addInstruction(lex.parseLine(reader.readLine()));
        }
        return outputTree;
    }

    // Compiles the source file or string data provided in constructor
    public void compile() throws IOException {

        // Read contents of file into Buffered Reader
        fileReader = getFileReader(fileName);

        // Run CompilerTools.Lexer on the contents of the reader
        program = runLexer(fileReader);



    }

}
