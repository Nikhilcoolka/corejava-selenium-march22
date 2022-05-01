package org.matrix.shriniwas.corejava.methods;

public class TestMethodsConceptNew {
    int c = 100;
    int d = 200;

    public void add(int a, int b) {
        System.out.println(c + d); // 300
        System.out.println(a + b); // 30
    }

    public void getData(String str, int age, String strNew) {
        System.out.println(str);
        System.out.println(age);
        System.out.println(strNew);
    }

    public static void main(String[] args) {
        TestMethodsConceptNew obj = new TestMethodsConceptNew();
        obj.add(10, 20);

        obj.getData("Shri1", 10, "Shri2");

    }
}
