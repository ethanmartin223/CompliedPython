import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Compiler c = new Compiler("testFile.py");
        c.compile();
    }
}