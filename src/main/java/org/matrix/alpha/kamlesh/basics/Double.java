package org.matrix.alpha.kamlesh.basics;

public class Double {
    public static void Divide(double a, double b) {
        double c = (a / b);
        System.out.println("Divide of 2/5 = " + c);
    }

    public static void main(String[] args) {
        Double obj = new Double();
        Divide(2, 5);
    }
}
