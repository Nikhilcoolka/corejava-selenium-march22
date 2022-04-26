package org.matrix.lambda.nisha.practice.javatrycatch;

public class Test_Try_Catch {

    public static void main(String[] args) {

        try {
            int data = 24 / 0;
        } catch (ArithmeticException ref) {
            System.out.println("rest of the code .....");
        }
    }
}




/*

---------------Java Try Catch--------------

Syntax of try catch block
try{
// code that may throw exception
}catch (Exception_Class_Name ref) {
    }

 */

