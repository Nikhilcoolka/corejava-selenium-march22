package org.matrix.omega.nayan;

/* 1) Instance Variable  can be use in instance method
   a) direct access

   2) instance variable can be use in static method
   a) by using object reference

   3) static variable can be use in instance method
   a) by object reference
   b) by using class name (recommended)

   4) static variable use in static method
   a) by using object reference
   b) by using direct access
   c) by class name  (Recommended)

*/
public class PractiseOneVariable {

    int year = 2022;  //Non static Instance Variable
    static String str = "MARCH";   // static variable


    PractiseOneVariable() {    // local variable inside the constrctor
        int birtyear = 1998;
        System.out.println(birtyear);

    }

    public void display() {         //Instance method
        int a = 10;//Local Variable are nedded to intilize value
        int i = 100;
        System.out.println(a); // when method start ,memory deallocation when method end
        System.out.println(i); //
        System.out.println(PractiseOneVariable.str); // by using class name
        System.out.println(year);
    }

    public void display1() {   // 1
        System.out.println(year);  // a
    }


    public static void main(String[] args) {        //Static method
        PractiseOneVariable obj = new PractiseOneVariable();   // 2
        System.out.println(obj.year);    // a
        obj.display();
        obj.display1();
        System.out.println(PractiseOneVariable.str); //static variable use static method class name recomended
    }


}
