# Abstract-Class-Grammar
A grammar application for C# abstract classes.

java -cp antlr-4.5.3-complete.jar org.antlr.v4.Tool AbstractClass.g4 -visitor && javac -cp antlr-4.5.3-complete.jar *.java && java -cp .:antlr-4.5.3-complete.jar Main

java -Xmx500M -cp antlr-4.5.3-complete.jar org.antlr.v4.Tool AbstractClass.g4 && javac AbstractClass*.java && java org.antlr.v4.gui.TestRig AbstractClass r -tree
