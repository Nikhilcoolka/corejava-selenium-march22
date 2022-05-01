package org.matrix.alpha.kamlesh.constructor;

public class ParameterizedConstructor {

    public ParameterizedConstructor(int no,String name,double value) {
        System.out.println(+no);
        System.out.println("Kamlesh"+name);
        System.out.println(value);
    }

    public static void main(String[] args) {
        ParameterizedConstructor obj = new ParameterizedConstructor(1,"",7.5);
    }

}