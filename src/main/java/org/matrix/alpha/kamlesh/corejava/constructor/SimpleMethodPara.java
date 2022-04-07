package org.matrix.alpha.kamlesh.constructor;

public class SimpleMethodPara {

    SimpleMethodPara(String a) {
        System.out.println("Parameterized "+a);
    }
    SimpleMethodPara(int b) {
        System.out.println("Lucky no is " +b);
    }

    public static void main(String[] args) {
        SimpleMethodPara smp = new SimpleMethodPara("function");
        SimpleMethodPara smp1 = new SimpleMethodPara(10);
    }
}

