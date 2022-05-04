package org.matrix.delta.monika.program;

public class TestChild extends TestParent{
    TestChild(){
        super();
        System.out.println("TestChild::constructor");
    }

    public static void main(String[] args) {
        TestChild test = new TestChild();
    }
}
