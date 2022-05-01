package org.matrix.delta.rahul.interfaceconcept;

public class Testclass implements TestInterface,TestInterface2{
    @Override
    public void m1() {
        System.out.println("TestInterface:: m1");
    }

    @Override
    public void m2() {
        System.out.println("TestInterface::m2");

    }


    @Override
    public void m4() {
        System.out.println("TestInterface1::m4");
    }

    @Override
    public String m5() {
        return "Rahul";
    }

    public static void main(String[] args) {
        TestInterface obj=new Testclass();
        obj.m1();
        obj.m2();
        TestInterface2 obj1=new Testclass();
        obj1.m4();
        String name=obj1.m5();
        System.out.println(name);
        //age=25 // can not change the value if variable with final keyword and initionalisation already
        // System.out.println(age);


    }
}
