package org.matrix.delta.rahul.method;

public class MethodWithReturnType {
    public int studDetails(int age) {
        System.out.println(age);
        return age;
    }

    public static void main(String[] args) {
        MethodWithReturnType obj=new MethodWithReturnType();
        obj.studDetails(15);
    }
}
