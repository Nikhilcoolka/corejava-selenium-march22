package org.matrix.lambda.nisha.practice.javatrycatch;

import java.io.PrintStream;

public class Nested_TryCatch_Block {

    public static void main(String[] args) {
        try {
            try {
                System.out.println("going to divide.....");
                int a = 893 / 0;
            } catch (ArithmeticException ref1) {
                System.out.println(ref1);
            }

            try {
                int arr[] = new int[4];
                arr[6] = 34;
            } catch (ArrayIndexOutOfBoundsException ref2) {
                System.out.println(ref2);}

                System.out.println("Other statements...");
            } catch (Exception ref3) {
                System.out.println("Handled.");
            }
        System.out.println("Normal flow");
        }
    }




/*

---------------Nested Try Catch Block--------------
---> The try catch block within try catch block is known as nested try block in java.

# Why use nested try catch block
---> Sometimes a situation may arise where a part of a block may cause one error and
the entire block itself may cause another error. In such cases, exception handlers have to be nested.

Syntax :
try
{
    Statement 1;
    Statement 2;
    try
    {
        Statement 1;
        Statement 2;
    }catch (Exception ref)
{
}

 */