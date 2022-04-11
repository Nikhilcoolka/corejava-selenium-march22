package org.matrix.delta.ganesh;

public class VariableConcept {

    int i = 10;   // instance variable
    static int s;
    int m;

    public void sampleData() {
        int j = 22;  // local variable
        System.out.println("Local variable: " + j);
        System.out.println("Variable value: " + i);
        System.out.println("Static Variable value: " + s);
    }

    public static void main(String[] args) {
        System.out.println(s);
//        System.out.println(m);  // non static variable can not be accessed in static context
        VariableConcept variableConcept = new VariableConcept();
        variableConcept.sampleData();
    }
}
