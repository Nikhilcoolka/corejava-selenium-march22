package org.matrix.delta.prem.javaconcepts.methods;

public class TestMethodConceptNew {

    int a = 500;
    int b = 700;

    public void add(int a, int b) { // local variables have highest priority thn instance variables
        System.out.println(this.a + this.b); // this. refers to current class instance
        System.out.println(a + b);
    }


    public void getData(String str, int age, String strnew) {
        System.out.println(str); //sequence of parameter datatype does matter sequence must be same
        System.out.println(age);
        System.out.println(strnew);

    }


    public static void main(String[] args) {
        TestMethodConceptNew obj = new TestMethodConceptNew();
        obj.add(10, 20);
        obj.getData("Ayushi", 24, "pikachu");
    }

}
