package org.matrix.omega.jagannath.corejava.Polymorphism.Overloading.Overriding;

public class TestOverrideChild extends TestOverrideParent{
    public void method1()
    {
        System.out.println("I am in child Method1");
    }
    public static void main(String[] args)
    {

        // Parent ref and Parent Object
        TestOverrideParent parent=new TestOverrideParent();
        parent.method1();
        // Compiler will check if method1() method is present in Parent class or not.
        // If yes, at Runtime JVM will call the method of whoever class object is created

        // Child ref and Child Object
        TestOverrideChild child=new TestOverrideChild();
        child.method1();
        // Parent ref and Child Object
        TestOverrideParent p1=new TestOverrideChild();
        p1.method1();

        // Compiler will check if m1() method is present in Parent class or not.
        // If yes, at Runtime JVM will call the method of whoever class object is created

        // Child ref and Parent Object
        // TestOverridingChild c1 = new TestOverridingParent();
        //In the above case it will give the error type cast
    }

}
