package org.matrix.sigma.prajakta.corejava.constructor;

public class ConstructorDemo {
    int id;
    String name;

    //No-Args constructor
    ConstructorDemo() {
        super();   //this is the first statement in constructor.
        System.out.println("This is No-args constructor");
    }

    //Parameterized constructor
    ConstructorDemo(int id, String name) {
        this.id=id;
        this.name=name;
    }

    void getData(){
        System.out.println("Id :-" + this.id);
        System.out.println("Name :-" + this.name);
    }

    public static void main(String[] args) {
        ConstructorDemo obj = new ConstructorDemo(); //call no-args constructor
        ConstructorDemo obj2 = new ConstructorDemo(1, "Prajakta");  //call parameterized constructor
        obj2.getData();
    }
}
