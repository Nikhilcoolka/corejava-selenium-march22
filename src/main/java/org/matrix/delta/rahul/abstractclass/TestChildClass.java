package org.matrix.delta.rahul.abstractclass;

public class TestChildClass extends TestParentAbstract{
    @Override
    public void saving() {
        System.out.println("It is saving method");
    }

    @Override
    public void current() {
        System.out.println("it is current method");
    }

    public static void main(String[] args) {
        //TestParentAbstract obj=new TestParentAbstract();// we can not create abstract class ref variable
        TestChildClass obj=new TestChildClass();
        obj.current();
        obj.saving();
        obj.m1();
    }
}
