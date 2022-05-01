package org.matrix.sigma.kadambari.method;

public class TestMethodReturnType {

    public int addition(int a, int b) {
        int c = a + b;// c is integer thats why return int
        //System.out.println("Addition is:" +c);
        return c;
    }

    public int multiplication(int a, int b) {
        int mul = a * b;
        //System.out.println("Multi is : " +c);
        return mul;
    }

    public String getName(String name) {
        return name;
    }

    public static void main(String[] args) {
        TestMethodReturnType obj = new TestMethodReturnType();
        int add = obj.addition(10, 20);
        System.out.println(add);
        obj.multiplication(15, 2);
        int mul = obj.multiplication(15, 2);
        System.out.println(mul);
        String str = obj.getName("shravi");
        // System.out.println(obj.getName("shravi"));
        System.out.println(str);
    }
}
