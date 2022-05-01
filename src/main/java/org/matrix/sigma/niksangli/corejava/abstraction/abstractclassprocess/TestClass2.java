package org.matrix.sigma.niksangli.corejava.abstraction.abstractclassprocess;

public class TestClass2 extends TestClass1 {

   // TestClass2() {
      //  System.out.println("I am in testclass2 constructor");
    //}

    public void withdrawn() {
        System.out.println("I am in withdrawn method");

    }

    public static void main(String[] args) {
        TestClass2 obj = new TestClass2(); // c to c
        obj.current();
        TestClass1 obj1 = new TestClass2();  // p to c


    }
}
