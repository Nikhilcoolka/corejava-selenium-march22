package org.matrix.delta.monika.program;

public class TestConstructorChaining {
    public  TestConstructorChaining() {
        this(100, "Monika");
        System.out.println("Im in test1 method");

    }

    public TestConstructorChaining(int age){
        System.out.println("i am in test2 method");
    }
    public TestConstructorChaining(int age,String name){
        this(28);
        System.out.println("i am in two parents");
    }
    public static void main(String[] args) {
       TestConstructorChaining test = new TestConstructorChaining();
    }
}
