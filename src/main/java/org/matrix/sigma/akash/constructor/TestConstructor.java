package org.matrix.sigma.akash.constructor;
/* Constructor - it is a special method that is used to initialise objects and instance variable.
The Constructor is called when an object of class is created.
Note - 1. If there is no constructor in the class, the compiler automatically created default constructor.
       2. Constructors name should be same as per class name and there is no return type.
 */
public class TestConstructor {
    public TestConstructor() {
        System.out.println("it is no args constructor");
        int a = 10, b = 20;
        int c = a + b;
        System.out.println("Addition is " + c);
        System.out.println("--------------------");
    }
    public TestConstructor(int a, int b){
        System.out.println("it is parameterised constructor ");
        System.out.println("Multiplication is  " +(a*b));
    }
    public static void main(String[] args) {
        TestConstructor obj = new TestConstructor();//object created by using with name
        new TestConstructor(10,20);//name less object
        }
}
