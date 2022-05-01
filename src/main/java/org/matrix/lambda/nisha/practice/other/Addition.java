package org.matrix.lambda.nisha.practice.other;

public class Addition {
    public static void main(String[] args) {
        int  x=3, y=5;
        int z=10;
        int sum = ++z + y - y + z + x++; // 11+5-5+11+3
        System.out.println(x++);

        System.out.println(sum);
    }
}


/*Explanation:

        Values of variables: x=3, y=5, z=10
        Given Expression:++z + y – y + z + x++
        above expression ++z is pre increment by one value so ++z is 11, and
        x++ value is post increment value incremented by 1 but it will be stored in the
        next x value so x++ will be 3.

        Exp=++z + y – y + z + x++
        exp= 11+5-5+11+3= 25
        hence the option C) 25 Value is correct.*/
