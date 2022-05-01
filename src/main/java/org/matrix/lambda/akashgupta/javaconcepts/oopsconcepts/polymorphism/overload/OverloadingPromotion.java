package org.matrix.lambda.akashgupta.javaconcepts.oopsconcepts.polymorphism.overload;

public class OverloadingPromotion {
    public void add(float a, int b) {
        System.out.println(a + b);
    }

    public void add1(int a, int b) {
        System.out.println(a + b);
    }

    public void add2(char a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        int b = 'a';
        char letter = 97;           //compile time promotion/typecasting??????????
        System.out.println(b + " is ascii value of :" + letter);
        OverloadingPromotion obj = new OverloadingPromotion();
        obj.add(10, 10);   // compile time promotion of variable a (10 int) to float
        obj.add1('a', 10);  // compile time promotion (char ---> int)
        //obj.add2(97,10);   // down promotion is not allowed i.e(int ---> char)
        obj.add2('9', 1);
    }
}
