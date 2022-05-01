package org.matrix.delta.rahul.constuctor;

public class ConstructorWithParameterList {
    int age; String name;
     public ConstructorWithParameterList(int age,String name) {
         this.age=age;
         this.name=name;
     }
     public void getData() {
         System.out.println(age);
         System.out.println(name);
     }

    public static void main(String[] args) {
        ConstructorWithParameterList obj=new ConstructorWithParameterList(10,"Rahul");
        obj.getData();
        ConstructorWithParameterList obj1=new ConstructorWithParameterList(25,"Sager");
        obj1.getData();
    }
}
