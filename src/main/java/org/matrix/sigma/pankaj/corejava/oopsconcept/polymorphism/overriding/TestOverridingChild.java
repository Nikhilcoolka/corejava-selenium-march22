package org.matrix.sigma.pankaj.corejava.oopsconcept.polymorphism.overriding;

public class TestOverridingChild extends TestOverridingParent {

    public void m1(){
        System.out.println(" i am in child :: m1 method");
    }

    public static void main(String[] args) {

        //parent ref and parent obj
        TestOverridingParent p1 = new TestOverridingParent();
        p1.m1();
        //compiler will check m1() method present in parent class or not.
        //if yes, at runtime jvm call the method of whoever class object is created


        //chid ref & child object
        TestOverridingChild c1 = new TestOverridingChild();
        c1.m1();

        //parent ref & chid object
        TestOverridingParent parent = new TestOverridingChild();
        parent.m1();
        //compiler will check m1() method present in parent class or not.
        //if yes, at runtime jvm call the method of whoever class object is created



         //chid ref & parent obj
       // TestOverridingChild c1 = new TestOverridingParent();


    }
}
