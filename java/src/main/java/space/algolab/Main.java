package space.algolab;

import space.algolab.field.JavaVariables;
import space.algolab.field.JavaVariablesSetter;

public class Main {
    static {
        System.loadLibrary("c");
    }

    public static void main(String[] args) {
        JavaVariables javaVariables = new JavaVariables();
        JavaVariablesSetter javaVariablesSetter = new JavaVariablesSetter();

        javaVariables.printPrivates();
        // set private variable from native
        javaVariablesSetter.setPrivateNum(javaVariables, 33);
        javaVariablesSetter.setStaticPrivateNum(javaVariables, 4);
        javaVariables.printPrivates();
    }
}