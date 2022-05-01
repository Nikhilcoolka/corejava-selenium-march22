package org.matrix.lambda.akashgupta.javaconcepts.corejava.methods;

import org.matrix.lambda.akashgupta.javaconcepts.corejava.classes.Employee;

public class MethodClassArgument {

    public static void diplay(Employee x){
        x.getData();
    }

    public static void main(String[] args) {
        diplay(new Employee());
    }
}
