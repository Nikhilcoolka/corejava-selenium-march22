package org.matrix.sigma.prajakta.corejava.polymorphism.overloading;

public class OverloadingDemo {
    /* method overloading concept
         Rule 1 : Method should be in same class.
         Rule 2 : Method name should be same

    */
    //Rule 3 : same name but different parameters
    void add(int a,int b){
        System.out.println("Addition of 2 numbers::"+a+b);
    }

    void add(int x,int y,int z){
        System.out.println("Addition of 3 numbers::"+x+y+z);
    }

    //Rule 4 : same number of parameter but data type is different
    void getData(int id, String name){
        System.out.println("ID::"+id);
        System.out.println("Name::"+name);
    }

    void getData(String name, int id){
        System.out.println("Name::"+name);
        System.out.println("ID::"+id);
    }

    //Rule 5 : Sequence of parameters does also matter

    void demo(int a, String b){
        System.out.println(a);
        System.out.println(b);
    }

    void demo(String a, int b){
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        OverloadingDemo obj=new OverloadingDemo();
        obj.add(10,20);
        obj.add(10,20,30);
        obj.getData(1,"Prajakta");
        obj.getData("Pallavi",2);
        obj.demo(1,"Prajakata");
        obj.demo("Pallavi",2);
    }
}
