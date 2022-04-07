package org.matrix.alpha.kamlesh.loop.patterntypes;

public class SimplePattern1 {

    public static void main(String[] args) {

        for (int i=6;i>=1;i--){     //outer loop

        for (int j=1;j<=i;j++){     //inner loop
            System.out.print("* ");
        }
            System.out.println();
        }

    }
}
