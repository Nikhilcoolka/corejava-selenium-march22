package org.matrix.delta.rahul.methodoverloading;

public class TestMethodOverloading {
    public void getData() {
        System.out.println("I am with out parameter method");
    }

    public void getData(int a) {
        System.out.println("Value of A " + a);
    }

    public void getData(int a, int b) {

        System.out.println("Addition of value a&b " + (a + b));
    }

    public void getData(int age,String name) {
        System.out.println("Age "+age+" Name "+name);

    }
    public void getData(boolean age) {
        System.out.println(age);
    }
    public static void main(String[] args) {
        TestMethodOverloading obj = new TestMethodOverloading();
        obj.getData();
        obj.getData(25);
        obj.getData(10, 52);

        obj.getData(25,"Rahul");

        obj.getData(true);

        int[]arr={10,20,30};
        main(arr);
    }
//we can also overload the main method
    public static void main(int[] a) {
        System.out.println("main method overloading");

    }
}