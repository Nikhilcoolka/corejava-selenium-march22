package org.matrix.sigma.pankaj.Method;

public class TestMethodReturnType {

    //   public void Addition(int a , int b){
    public int Addition(int a, int b) {
        int c = a + b;
        // System.out.println("Addition of two number :" +c);
        return c;
    }


    //public void Multiplication(int a, int b) {
    public int Multiplication(int a, int b) {

        int multi = a * b;
        //  System.out.println("Multiplication of two number :" + c);

        return multi;
    }

    public String getname(String name) {
        return name;
    }

    public static void main(String[] args) {
        TestMethodReturnType obj = new TestMethodReturnType();
        int add = obj.Addition(50, 60);
        System.out.println(add);
        int multi = obj.Multiplication(300, 600);
        System.out.println(multi);

        String str = obj.getname("panky");
        System.out.println(str);

        // obj.Multiplication(50,60);
    }
}
