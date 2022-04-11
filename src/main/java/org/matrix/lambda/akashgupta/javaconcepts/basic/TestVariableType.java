package org.matrix.lambda.akashgupta.javaconcepts.basic;

public class TestVariableType {
    int age;  //instance variable
    static String name; // default is null but if initialized it will hold that value until its reassigned

    TestVariableType() {
        System.out.println("Object is created with default:");
        display();         // can call outside static method directly within class
        System.out.println("Reassigning in constructor:");
        age = 10;
        name = ".....Renamed in constructor";//static variable call directly throughout the class.
        System.out.println("Leaving constructor after reassignment:");
    }

    public void display() {
        System.out.println(age);   // instance variable can be called directly in non-static method of class
        System.out.println(name);
    }


    public static void main(String[] args) {
        int age = 29;
        System.out.println("this is main: ");
        //TestVariableType.display();   // cannot call non static method directly/classname. reference
        TestVariableType obj;
        obj = new TestVariableType();
        System.out.println("Back to main after reinitializing \nCalling display in main with obj reference:");
        obj.display();      //can only call 'object.' reference in static method
        System.out.println("Use of obj reference access in static method:");
        System.out.println(obj.age); //cannot use 'classname.' reference to non-static variable/method
        System.out.println(TestVariableType.name);//static variable call by 'classname.' reference
        name = "......back to main";
        System.out.println("This is local variable:");
        System.out.println(age);
        System.out.println(name);

    }


}
