package org.matrix.alpha.nikhilesh.Methods;

public class NewMethods {
    int a= 500;
    int b =100;

    public void display(int a, int b) {
        System.out.println(a+b);
        space();
        System.out.println(a-b);
        space();
        System.out.println(a%b);
        space();
        System.out.println(a*b);
        space();
        System.out.println("This Value is Instance Variable ");
        System.out.println(this.a+this.b);//It Can use Value For Instance Variable ( a=500,b=100)
        space();
        System.out.println("This is Non-Static Method");
    }
    public void add1(){
        System.out.println(a+b);
    }
    public static void add(int c, int d){
        System.out.println(c+d);
        NewMethods.space();
        System.out.println(c-d);
        NewMethods.space();
        System.out.println(c%d);
        NewMethods.space();
        System.out.println(c*d);
        NewMethods.space();
        System.out.println("This is Static Method");
    }
public static void space() {
        System.out.println("---------------------------"); //New Method Can Apply Both Static & Non-Static Method
    }
    public static void main(String[] args) {
        NewMethods nm=new NewMethods(); //Obj Ref Creation
        nm.display(10,20); //Parameter Initialized By Using Obj Ref
        add(25,50);//Parameter Initialized By the Directly
        nm.space();
        nm.add1();
    }

}
