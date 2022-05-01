package org.matrix.sigma.pankaj.Method;

public class TestMethodsWithThisKeyword {

    public void s1() {
        System.out.println("i am in s1 method");
    }

    public void s2() {
        this.s1();
        System.out.println("i am in s2 method");
    }

    public String s3() {
        this.s1();
        s2();
        String str = " i am in s3 method";
        return str;
    }

    public static void main(String[] args) {
        TestMethodsWithThisKeyword obj = new TestMethodsWithThisKeyword();
        // obj.s2();

        String str = obj.s3();
        System.out.println(str);
    }
}
