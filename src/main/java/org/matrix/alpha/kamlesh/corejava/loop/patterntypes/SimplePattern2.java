package org.matrix.alpha.kamlesh.loop.patterntypes;

public class SimplePattern2 {
    public static void main(String[] args) {
        int n = 5;
            for (int i = 1; i <= n; i++) {    //outer
            for (int j = 1; j <= i; j++) {    //inner
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
