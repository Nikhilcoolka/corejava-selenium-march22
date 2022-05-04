package org.matrix.sigma.ashish.Constructor;

public class TestConstructorChaining {

    public TestConstructorChaining() {
        this(30);
        System.out.println("I am in No Arguments Constructor");
    }

    public TestConstructorChaining(int age) {
        this(30, "Ashish Thopate");
        System.out.println(" I am in Single ParameterConstructor");
        System.out.println("Employee age  " + age);
        System.out.println("-------------------------------------------");
    }

    public TestConstructorChaining(int age, String name) {
        System.out.println(" I am in Double Parameter Construstor");
        System.out.println("Employee Name  " + name);
        System.out.println("Employee Age  " + age);
        System.out.println("-----------------------------------------");
    }

    public static void main(String[] args) {
        TestConstructorChaining obj = new TestConstructorChaining();
    }
}
