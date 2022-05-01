package org.matrix.delta.rahul.abstractclass;

public class TestAbstractExampleChild2 extends  TestAbstractExamplechild1{
    @Override
    public void hdfc() {
        System.out.println("I am the HDFC Bank Details Method");

    }

    public static void main(String[] args) {
        TestAbstractExampleChild2 obj=new TestAbstractExampleChild2();
        obj.bank();
        obj.icici();
        obj.sbi();
        obj.hdfc();

    }
}
