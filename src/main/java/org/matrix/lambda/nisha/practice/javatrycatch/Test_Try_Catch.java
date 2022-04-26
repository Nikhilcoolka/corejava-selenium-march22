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




