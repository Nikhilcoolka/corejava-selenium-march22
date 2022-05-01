package org.matrix.delta.rahul.constuctor;

public class ConstructorWithOutParamater {
    int age;
    String name;
   public ConstructorWithOutParamater() {
        age=25;
        name="Rahul";
        System.out.println("Age is "+age);
        System.out.println("Name is "+name);
    }
     public static void main(String[] args) {
        ConstructorWithOutParamater obj=new ConstructorWithOutParamater();
    }
}
