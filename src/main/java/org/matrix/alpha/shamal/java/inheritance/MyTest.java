package org.matrix.alpha.shamal.java.inheritance;


public class MyTest extends ChildClass {

    public static void main(String[] args) {

        ChildClass obj = new ChildClass();
        obj.msg(); // Calling From ChildClass
        obj.msg1(); //Calling From ChildClass

        System.out.println("Hello i am from ChildClass :" + obj.x);

        BaseClass obj2 = new BaseClass();

        System.out.println("Value of x:  " +obj2.x);  // From BaseClass

        obj2.msg();

        /*Here MultiLevel Inheritance is archived */
        //BaseClass ->ChildClass->MyTest

    }
}
