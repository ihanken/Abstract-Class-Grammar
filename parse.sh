#!/bin/bash
java -cp antlr-4.5.3-complete.jar org.antlr.v4.Tool AbstractClass.g4 -visitor && javac -cp antlr-4.5.3-complete.jar *.java && java -cp .:antlr-4.5.3-complete.jar Main $1
