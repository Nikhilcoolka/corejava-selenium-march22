package org.matrix.alpha.kamlesh.methods;

public class MethodClassAnother {
    public int T1(int a, int b) {
        int c = a + b;
        return c;
    }
    public static int T2(int a, int b) {
        int c = a * b;
        return c;
    }
    public static String getName(String name) {
        return name;
    }

    public static void main(String[] args) {
        MethodClassAnother obj = new MethodClassAnother();
        int K1 = obj.T1(1,1);
        System.out.println(K1);
        System.out.println(T2(4,2));
        System.out.println(getName("Im done"));
    }
}

