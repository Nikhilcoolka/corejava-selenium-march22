package org.matrix.alpha.kamlesh.methods;


public class MethodWithDiffDataTypes {
    public int K1(int a, int b) {
        int c = a / b;
        return c;
    }
    public double K2(double a, double b) {   /* These are the example of data return type */
        double d = a / b;
        return d;
    }
    public boolean K3() {
        return true;
    }
    public String getName (String name) {
        return name;
    }

    public static void main(String[] args) {
        MethodWithDiffDataTypes obj = new MethodWithDiffDataTypes();
        int abc = obj.K1(8,2);
        double def = obj.K2(6,2);
        boolean bo = obj.K3();
        System.out.println(abc);
        System.out.println(def);
        System.out.println(bo);
        System.out.println(obj.getName("Im challenging person"));
    }

}

