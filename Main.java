import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {
    public static void main(String[] args) throws Exception {
        AbstractClassLexer lexer = new AbstractClassLexer(CharStreams.fromFileName("test.txt"));
        AbstractClassParser parser = new AbstractClassParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.full();
    }
}
