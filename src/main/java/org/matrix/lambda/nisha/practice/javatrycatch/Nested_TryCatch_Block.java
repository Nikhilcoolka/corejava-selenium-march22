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

