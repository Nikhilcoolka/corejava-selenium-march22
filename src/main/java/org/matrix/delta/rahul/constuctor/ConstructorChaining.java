package org.matrix.delta.rahul.constuctor;

public class ConstructorChaining {
    int age;
    String name;
    public ConstructorChaining() {
        System.out.println("I am a with out parameter constructor");
    }
    public ConstructorChaining(int age,String name) {

        this.age=age;
        this.name=name;
        System.out.println("Age is "+age);
        System.out.println("Name is "+name);
    }

    public ConstructorChaining(int rollNumber) {
        this(10,"Sagar");

        System.out.println("Roll Number"+rollNumber);
    }

    public static void main(String[] args) {
        ConstructorChaining obj=new ConstructorChaining(25);
        ConstructorChaining obj1=new ConstructorChaining();
    }
}
