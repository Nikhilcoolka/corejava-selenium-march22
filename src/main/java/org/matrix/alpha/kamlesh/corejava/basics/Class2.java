package org.matrix.alpha.kamlesh.basics;

public class Class2 {

    public void multiplication(int a, int b){

        int c = a * b;
        System.out.println("Multiplication is :" + c);
    }

    public static void division(int a, int b){

        int c = a / b;
        System.out.println("Multiplication is :" + c);
    }

    public static void main(String[] args) {

        Class2 class2 = new Class2();
        //class2.multiplication(10,20);
        class2.multiplication(Class1.a,Class1.b);


        Class1.display();
        Class1 class1 = new Class1();
        //class1.addition(10,20);

        class1.addition(Class1.a,Class1.b);
        class1.addition(Class1.a,Class1.b);
        class1.addition(Class1.a,Class1.b);
        class1.addition(Class1.a,Class1.b);
        class1.addition(Class1.a,Class1.b);
        class1.addition(Class1.a,Class1.b);
        class1.addition(Class1.a,Class1.b);
        class1.addition(Class1.a,Class1.b);
        class1.addition(Class1.a,Class1.b);
        class1.addition(Class1.a,Class1.b);
        class1.addition(Class1.a,Class1.b);


        division(class1.d,Class1.a);

    }

}
