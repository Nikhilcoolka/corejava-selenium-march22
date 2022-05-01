package org.matrix.lambda.akashgupta.javaconcepts.oopsconcepts.polymorphism.overload;

public class MethodOverloading {

    public void m1() {
        System.out.println("This is public m1 ");
        m1("akash");      //private members can be called or passed only in class body
    }

    private void m1(String str) {    //private members can be called or passed only in class body
        System.out.println("This is private m1 ");
    }

    public static void m1(int a, String str) {
        System.out.println("This is public static m1\n" + "Name:" + str + "\tId:" + a);
    }

    public int m1(boolean bool) {
        if (bool)
            return 1;
        else
            return 0;
    }

    protected void m1(float a) {
        System.out.println("This is protected void m1(float)\n" + "You have passed :" + a);
    }

    public void m1(String str, int a) {
        System.out.println("This is m1(String,int)\n" + "Name:" + str + "\tId:" + a);
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.m1();
        obj.m1(10);
        obj.m1(true);
        obj.m1("Akash", 29);
        m1(29, "akash");

    }
}
/* ...............................................................
Method Overloading can also be referred as CompileTime Polymorphism
Override rules:
*It should be in same class
*Signature should be same (Type/access modifier is not taken under consideration) but different parameter
*Same signature and parameters but  different dataType of parameters
*Same sig  with different no of param
*Same sig and parameter but sequence of parameters must be different
*/