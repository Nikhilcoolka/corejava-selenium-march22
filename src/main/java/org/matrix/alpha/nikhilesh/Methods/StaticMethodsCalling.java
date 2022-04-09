package org.matrix.alpha.nikhilesh.Methods;

public class StaticMethodsCalling {
    int age=25;
    static String name="Nikhil";
    public void show(){
        System.out.println("This NON-Static Methos Call");
        System.out.println(age);
        System.out.println(name); //Directly Using Name
        System.out.println("--------------------------------");
    }
    public static void display(){
        System.out.println("This Static Methos Call");
        System.out.println(StaticMethodsCalling.name);// By Using Class Name
    }

    public static void main(String[] args) {
        StaticMethodsCalling sat=new StaticMethodsCalling();

        System.out.println("This is String Variable Call");

        System.out.println(sat.name); // Call to String Variable By Using Obj ref ie:sat

        System.out.println("--------------------------------");

        sat.show(); // Call to Non-Static Method By Using Obj Ref

        StaticMethodsCalling.display();  // Call to Static Method Using Class Name
    }
}
