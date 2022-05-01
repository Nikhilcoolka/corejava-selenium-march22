package org.matrix.sigma.pankaj.Method;

public class TestMethodConcept2 {
    int a = 101;
    int b = 102;


    // method with parameter
    public void add(int a, int b) {
        System.out.println(this.a + this.b);
        System.out.println(a + b);

    }

    public void getdata(String str, int age, String strnew) {
        System.out.println(str);
        System.out.println(age);
        System.out.println(strnew);
    }

    public static void main(String[] args) {
        TestMethodConcept2 obj = new TestMethodConcept2();
        obj.add(1, 2);

        obj.getdata("pankaj", 28, "kurhade");
    }

}
