package org.matrix.alpha.nikhilesh.Methods;

public class JavaVariable {
    int age=27;
    public void show(){
        System.out.println(age);
    }

    public static void main(String[] args) {
        System.out.println("New Variable");
        JavaVariable abc=new JavaVariable();
        System.out.println(abc.age);
    }
}
