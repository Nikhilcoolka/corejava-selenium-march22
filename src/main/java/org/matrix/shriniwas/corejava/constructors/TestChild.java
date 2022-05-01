package org.matrix.shriniwas.corejava.constructors;

public class TestChild extends TestParent {

    TestChild() {
        super(); // Compiler will add super() as a first statement in constructor
        System.out.println("TestChild :: Constructor");
    }

    public void get() {
        System.out.println("This is a method");
    }

    public static void main(String[] args) {
        TestChild obj =  new TestChild();
        obj.get(); // By using ref variable

        new TestChild().get(); // Without using ref variable

        TestParent obj1 = new TestParent();
    }
}
