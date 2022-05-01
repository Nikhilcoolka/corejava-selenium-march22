package org.matrix.sigma.pankaj.corejava.oopsconcept.polymorphism.overriding;

public class TestOverridingChild1 extends TestOverridingParent1 {

    public void m1(int i){
        System.out.println(" i am in child :: m1(int) method");
    }
    public void m1(String str){
        System.out.println(" i am in child :: m1(string) method");
    }


    public static void main(String[] args) {

        //parent ref and parent obj
        TestOverridingParent1 p1 = new TestOverridingParent1();
        p1.m1(10);

        //compiler will check m1() method present in parent class or not.
        //if yes, at runtime jvm call the method of whoever class object is created


        //chid ref & child object
        TestOverridingChild1 c1 = new TestOverridingChild1();
        c1.m1(20);


        //parent ref & chid object
        TestOverridingParent1 parent = new TestOverridingChild1();
        parent.m1(30);
        parent.m1("pankaj");

        //compiler will check m1() method present in parent class or not.
        //if yes, at runtime jvm call the method of whoever class object is created



         //child ref & parent obj
       // TestOverridingChild c1 = new TestOverridingParent();


    }
}
