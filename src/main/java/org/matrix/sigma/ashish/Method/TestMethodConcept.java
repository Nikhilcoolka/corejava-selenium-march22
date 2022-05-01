package org.matrix.sigma.ashish.Method;

public class TestMethodConcept {
    int c = 100;
    int d = 200;

    public void add(int a, int b) {
        System.out.println(c + d);//300
        System.out.println(a + b);//30
    }

    public void getData(String str, int age, String strNew) {
        System.out.println(str);
        System.out.println(age);
        System.out.println(strNew);
    }

    public static void main(String[] args) {
        TestMethodConcept obj = new TestMethodConcept();
        obj.add(10, 20);

        obj.getData("Ashish", 30, "IDBI");
    }
}
