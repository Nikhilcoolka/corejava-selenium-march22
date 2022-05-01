package org.matrix.omega.neha.corejava.overloading;

public class MethodOverloading{

    private static void display(int a, int b){
        System.out.println("integer data: " +a + " and " +b);
    }

    private static void display(int a ,int b, int c){
        System.out.println("integer data: " +a  + " , " +b  + " and " +c);
    }

    public static void main(String[] args) {
        display(10,20);
        display(30,40,50);
    }

}
