package org.matrix.omega.jagannath;

public class LocalVariable {
    int a=10;
    int b=20;
    public void addition(int a,int b)
    {   // Access instance variable using this keyword
        System.out.println("Addition of two instance variable :");
        System.out.println(this.a+this.b); //"Addition of two instace variable :"
        System.out.println("Addition of two local variable :");
        System.out.println(a+b);//"Addition of two local variable :
    }
    public static void main(String[] args)
    {
        LocalVariable obj=new LocalVariable();
        //LocalVariable();
        obj.addition(25,25);
    }
}
