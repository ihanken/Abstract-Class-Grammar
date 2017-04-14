import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.tree.Trees;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.Token;
import java.util.Scanner;
import java.io.File;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.out.println("\nError: No file supplied. Please try again.");
        }
        else if (!(new File(args[0])).exists()) {
            System.out.println("\nError: " + args[0] + " does not exist. Please try again.");
        }
        else {
            AbstractClassLexer lexer = new AbstractClassLexer(new ANTLRFileStream(args[0]));
            AbstractClassParser parser = new AbstractClassParser(new CommonTokenStream(lexer));
            ParseTree tree = parser.full();

            System.out.println("\nOpening the parse tree...");

            List<String> ruleNames = Arrays.asList(parser.ruleNames);
            TreeViewer view = new TreeViewer(ruleNames, tree);
            view.open();
        }
    }
}
