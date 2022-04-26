package org.matrix.lambda.nisha.practice.javatrycatch;

public class Test_Multiple_Catch_Block_2 {

    public static void main(String[] args) {

        try {
            int arr [] = new int[5];
            arr[5] = 48/0;
        }

        catch (Exception abc) {System.out.println("Common task completed");}
        //catch (ArithmeticException ref) {System.out.println("Task 1 is completed");}
        //catch (ArrayIndexOutOfBoundsException xyz) {System.out.println("Task 2 is completed");}

        System.out.println("rest of the code......");
    }
}