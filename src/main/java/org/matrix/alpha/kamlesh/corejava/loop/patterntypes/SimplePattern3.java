package org.matrix.alpha.kamlesh.loop.patterntypes;
//Solid rectangle program
public class SimplePattern3 {
    public static void main(String[] args) {
            //outer loop
        for (int i=1;i<=7;i++){
            //inner loop
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
            System.out.println();
        }
    }
}