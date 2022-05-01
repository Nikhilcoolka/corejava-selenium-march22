package org.matrix.omega.jagannath.corejava.Inheritance;

public class Student1 extends Teacher {
    int a=11;
    Student1(){
        super();
        System.out.println("Student Constructor");
        System.out.println(this.a);
    }
    Student1(int i){
        System.out.println("Parameterized Constructor");
    }
    public void method1()
    {
        System.out.println("Student Method1");
        System.out.println(this.a);
        System.out.println(super.a);
        System.out.println(b);
        method2();
        super.method1();
        this.method2();

    }
    public static void main(String[] args)
    {
        Student1 obj=new Student1();
        obj.method1();
        obj.method2();
        System.out.println(obj.b);
    }

}
