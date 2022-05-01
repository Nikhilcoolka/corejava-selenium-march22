package org.matrix.alpha.kamlesh.methods;


public class MethodClassWithReturnType {
    public int Addition(int a, int b) {
        int c = a + b;
        return c;
    }
    public int Subtraction(int a, int b) {
        int c = a - b;
        return c;
    }
    public String getName(String name) {
        return name;
    }



    public static void main(String[] args) {
        MethodClassWithReturnType obj = new MethodClassWithReturnType();
        int add = obj.Addition(10,2);
        int sub = obj.Subtraction(4,7);
        System.out.println(add);
        System.out.println(sub);
        System.out.println(obj.getName("Padmaja"));
    }
}

