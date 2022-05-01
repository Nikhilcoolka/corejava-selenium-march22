package org.matrix.sigma.prajakta.corejava;

public class TestInstanceVariable {

    int i=10;

    TestInstanceVariable(){
        System.out.println("This is instance variable:-"+i);
    }

    public void getInstance(){
        System.out.println("You are in method :-"+i); //instance variable can also fetch in method.
    }
    public static void main(String[] args) {
        TestInstanceVariable obj=new TestInstanceVariable();
        // But not fetch in static method.
        obj.getInstance();
    }
}
