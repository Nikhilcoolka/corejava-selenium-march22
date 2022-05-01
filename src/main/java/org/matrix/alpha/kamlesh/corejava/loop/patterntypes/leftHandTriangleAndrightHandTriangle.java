package org.matrix.alpha.kamlesh.loop.patterntypes;

//*             //          *
//**            //         **
//***           //        ***
//****          //       ****
public class leftHandTriangleAndrightHandTriangle {

    public void leftHandTriangle(int number) {
        for (int i = 1; i <= number; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void rightHandTriangle(int number) {
        int n = number;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print("a");
            }
            for (int j = 1; j <= i; j++) {

                System.out.print("*");
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        leftHandTriangleAndrightHandTriangle obj = new leftHandTriangleAndrightHandTriangle();
        //  obj.leftHandTriangle(5);
        //    obj.rightHandTriangle(10);


 /* * * * *
  *       *
  *       *
  *       *
  * * * * */



           // for(int i =0;i<=10; i++){        //for loop statement
             //   System.out.print(i+" ");
           // }

           /* int i =0;
            while(i<11){
                System.out.println(i);
                i++;
            }*/

    }
}


