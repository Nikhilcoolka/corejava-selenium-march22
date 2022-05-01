package org.matrix.alpha.kamlesh.constructor;

public class TestChild extends TestParent {

    TestChild(){
        System.out.println("I am Child Class");   //In constructor by default class will be super when you use
    }

    TestChild(int n) {
        super(1);
        System.out.println("Child overloaded cons");
    }

    @Override
    public void display(){
        System.out.println("I am Child Class display");

    }




}
