package org.matrix.alpha.nikhilesh.Methods;

public class StaticMethodsCalling {
    int age=25;
    static String name="Nikhil";
    String sname="Shri";
    String surname="Alle";
    public void show(){
        System.out.println("This NON-Static Methos Call");
        System.out.println(age);
        System.out.println(sname);

       // System.out.println(name); //Directly Using Name

        System.out.println(surname);
        System.out.println("--------------------------------");
    }
    public static void display(){
        System.out.println("This Static Method Call");
        System.out.println("Directly Call: "+name); //Directly Using Variable Name
        System.out.println("In Static Variable Call :"+StaticMethodsCalling.name);// By Using Class Name Then Variable Name
    }

    public static void main(String[] args) {
        StaticMethodsCalling sat=new StaticMethodsCalling();

        System.out.println("This is String Variable Call");

        System.out.println(sat.age); // Call to Non-Static String Variable By Using Obj ref ie:sat

        System.out.println(name); // Call to String Variable By Using Obj ref ie:sat

        System.out.println(sat.surname); // Call to Non-Static String Variable By Using Obj ref ie:sat

        System.out.println("--------------------------------");

        sat.show(); // Call to Non-Static Method By Using Obj Ref

        StaticMethodsCalling.display();  // Call to Static Method Using Class Name

        display();  // Call to Static Method Directly
    }
}
