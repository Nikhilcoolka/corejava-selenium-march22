package org.matrix.omega.jagannath.corejava.abstraction;

public  class TestClass2 extends TestClass {
    @Override
    public void current()
    {
        System.out.println("I am in current method");
    }

    public static void main(String[] args) {
        TestClass2 obj=new TestClass2();
        obj.current();
        obj.saving();
        obj.withdrawal();
        obj.m1();
        }
    }

