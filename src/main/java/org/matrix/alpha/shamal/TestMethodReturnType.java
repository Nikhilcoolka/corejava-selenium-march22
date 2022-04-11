package org.matrix.alpha.shamal;

public class TestMethodReturnType {

    public int addNumber(int a, int b) {
        int c = a + b;
        return c;
    }

    public String getName(String str) {
        // str = "Shamal Jadhav";
        return str;
    }

    public static void main(String[] args) {
        TestMethodReturnType t = new TestMethodReturnType();
        int rest = t.addNumber(20, 30); // calling  via variable
        System.out.println(t.addNumber(20, 20)); // calling direct via object
        System.out.println(rest);

        String name = t.getName("Shamal Jadhav");
        System.out.println(t.getName("Shamal Matale"));
        System.out.println(name);
    }
}
