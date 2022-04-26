package org.matrix.lambda.nisha.practice.javatrycatch;

public class Test_Multiple_Catch_Block_1 {

    public static void main(String[] args) {

        try {
            int arr [] = new int[5];
            arr[5] = 48/0;
        }
        catch (ArithmeticException ref) {System.out.println("Task 1 is completed");}
        catch (ArrayIndexOutOfBoundsException xyz) {System.out.println("Task 2 is completed");}
        catch (Exception abc) {System.out.println("Common task completed");}

        System.out.println("rest of the code......");
    }
}


/*

-------------Rules for executing catch block------------
1. At a time only one exception is occurred and at a time only one catch block is executed.
2. All catch blocks must be ordered from most specific to most general i.e. ArithmaticException
must come before catch for Exception.

 */
