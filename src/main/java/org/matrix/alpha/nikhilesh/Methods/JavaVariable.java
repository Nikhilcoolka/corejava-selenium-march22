package org.matrix.alpha.nikhilesh.Methods;

public class JavaVariable {
    int age=27;
    static int a =30;
    public void show(){
        System.out.println(age);
    }
    public static void main(String[] args) {
        System.out.println("New Variable");
        JavaVariable abc=new JavaVariable();
        System.out.println(abc.age); //Non-Static Variable (int Age) call By Using Obj Creation

        System.out.println(a); // Static Variable (int a) call Directly Without Obj Creation
    }
}
