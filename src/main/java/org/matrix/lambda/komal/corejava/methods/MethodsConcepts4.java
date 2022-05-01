package org.matrix.lambda.komal.corejava.methods;

// method return type
public class MethodsConcepts4 {
    public int addition(int a,int b) {               // if you use return then provide proper data type of return
        int c= a+b;
        //System.out.println("addition is:" +c);
        return c;
    }

    public void multiplication(int a,int b) {       // void means no return value
        int c= a*b;
        System.out.println("multiplication is:" +c);

    }

    public static void main(String[] args) {
        MethodsConcepts4 obj=new MethodsConcepts4();
        //int add = obj.addition(10,20);  // write datatype of method and use var to store result and print tht var
        //System.out.println(add);
        //or you can use like below
        System.out.println(obj.addition(10,20));

        obj.multiplication(10,20);
    }
}
