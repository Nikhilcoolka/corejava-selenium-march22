package org.matrix.omega.jagannath;

public class MethodWithReturnType {
    int square(int no){
        return no*no;
    }
    public static void main(String[] args)
    {
        MethodWithReturnType obj=new MethodWithReturnType();
        int sq=obj.square(25);
        System.out.println("Square of 25 :" +sq);
    }
}
