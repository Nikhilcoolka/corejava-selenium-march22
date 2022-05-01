package org.matrix.sigma.akash.variable;

public class TestInstanceVariable {
    int age = 30;
    //This is non-static variable declared in the class.
    //Which can be used in whole class but not in the static methods.
    //scope - inside the whole class.

    TestInstanceVariable() {
        System.out.println("Age" + age);//Taken value from instance variable.
    }

    public void age() {
        System.out.println("your are in age method - " + age);//non-static method
    }

    public static void main(String[] args) {
        TestInstanceVariable obj = new TestInstanceVariable();
        obj.age();
        //System.out.println("Age" +age);//shows red as we can't use non-static variable into the static class.
    }

}
