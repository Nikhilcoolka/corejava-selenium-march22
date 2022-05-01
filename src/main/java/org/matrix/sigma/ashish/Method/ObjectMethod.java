package org.matrix.sigma.ashish.Method;

public class ObjectMethod {
    //static variables are deaclaire inside the class but outside of the methods
    //static variables are the instance variables
    int id = 1;
    String name = "Ashish";
    int age = 30;
    static String str = "AmitCloth";
    static String cmpname = "IDBI";


    int id1 = 2;
    String name1 = "Ashish11";
    int age1 = 40;

    public void getdata() {
        System.out.println("Company Name" + cmpname);
        //static variable used in static and nostatic method direcly in same class
        System.out.println("Employee id" + id);
        System.out.println("Employee name" + name);
        System.out.println("Employee Age" + age);
        System.out.println(ObjectMethod.str);//static variable called using class name
        System.out.println("--------------------------");
    }

    public void getdata1() {
        System.out.println("Company name" + cmpname);
        System.out.println("Employee id" + id1);
        System.out.println("Employee name" + name1);
        System.out.println("Employee Age" + age1);
    }

    public static void main(String[] args) {
        ObjectMethod om = new ObjectMethod();
        om.getdata();
        om.getdata1();
    }

}
