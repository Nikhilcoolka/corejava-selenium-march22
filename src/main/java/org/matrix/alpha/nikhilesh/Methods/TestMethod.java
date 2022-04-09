package org.matrix.alpha.nikhilesh.Methods;

public class TestMethod {
    public void show() // This is Method Declaration
    {
        System.out.println("it was an Instance Method"); // This is Method Implementation
    }
public static void display(){
    System.out.println("it was an Static Method");
}
    public static void main(String[] args) {
        TestMethod avc=new TestMethod(); // This is NON-Static Method Obj Ref Creation (avc)

        avc.show(); // This is NON-Static Method Calling By Using Obj Ref (avc)

        TestMethod.display(); // This is Static Method Calling By Using Class Name (TestMethod)

    }
}
