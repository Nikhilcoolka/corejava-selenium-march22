package org.matrix.alpha.kamlesh.polymorphism.methooverloading;

//Same number of Parameters but diff data types
public class TestOverloading2 {

    public void sub(int a, int b) {
        System.out.println(a - b);
    }

    public void m1(String str) {
        System.out.println("I am displaying string ");
    }

    public static void main(String[] args) {
        TestOverloading2 obj = new TestOverloading2();
        obj.m1(" ");
        obj.sub(98, 97);
    }

}
