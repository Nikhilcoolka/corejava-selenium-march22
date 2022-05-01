package org.matrix.omega.nayan.methods;

public class MethodParameterClass {
    int a = 500;

    public void display(int b) {
        System.out.println(b);
        System.out.println(this.a);
    }

    public void display(TestMethod b){   // by method parameter class
        b.parameters(12,"nayan",12.12f);


    }



    public static void main(String[] args) {
        MethodParameterClass obj = new MethodParameterClass();
        TestMethod obj1 = new TestMethod();
        obj1.parameters(120000);
        obj.display(12);
        obj.display(obj1);
    }
}