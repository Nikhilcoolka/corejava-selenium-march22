package org.matrix.sigma.prajakta.corejava.abstraction.interfaceconcept;

public class TestClass implements TestInteface1, TestInterface2 {
    @Override
    public void add(int a, int b) {
        int c = a + b;
        System.out.println("Addition :: " + c);
    }

    @Override
    public void multiply(int x, int y) {
        int z = x * y;
        System.out.println("Multiplication :: " + z);
    }

    @Override
    public void div(int p, int q) {
        int r = p / q;
        System.out.println("Division :: " + r);
    }

    @Override
    public int sub(int l, int m) {
        int o = l - m;
        return o;
    }

    public void getText() {
        String str = "Prajakta";
        System.out.println(str);
    }

    public static void main(String[] args) {
        TestClass obj = new TestClass();
        obj.getText();

        TestInteface1 obj2 = new TestClass();
        obj2.add(12, 20);
        obj2.multiply(10, 5);

        TestInterface2 obj3 = new TestClass();
        obj3.div(50, 10);
        int t = obj3.sub(50, 10);
        System.out.println("Subtraction :: " + t);
    }
}
