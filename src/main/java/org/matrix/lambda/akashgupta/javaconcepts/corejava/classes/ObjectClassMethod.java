package org.matrix.lambda.akashgupta.javaconcepts.corejava.classes;

import static org.matrix.lambda.akashgupta.javaconcepts.corejava.classes.Test.obj;

public class ObjectClassMethod implements Cloneable { //implement must for cloning
    int i;

    ObjectClassMethod(int i) {
        this.i = i;
    }

    public ObjectClassMethod clone() throws CloneNotSupportedException {
        return (ObjectClassMethod) super.clone();//returns clone of object & faster than "new" object.
    }


    void getClassMethod() {
        System.out.println("..................getClass explanation..................");
        //suppose we don't know Class of obj.
        Object ref = obj; //by import obj we can say it's class is Test, but actually it's not
        //direct print obj to get its details.
        System.out.println("\nobj(implicit toString):\n" + obj);//override toString() of Object class
        Class<?> v = obj.getClass();//returns metadata of class of an object(Class<k> Type)

        System.out.println("\nv-Class<?> method:\n" + v.getSimpleName());
        System.out.println("\nref(implicit toString):\n" + ref.getClass());//implicit ref.toString is called
        Class<?> x = ref.getClass();//Class<?> 'i.e' we don't know class of obj
        System.out.println("\nx-Class<> method:\n" + x.getSimpleName());//method for simplified class name

        Test obj1 = new Test();

        System.out.println("\nobj1(implicit toString)-:\n" + obj1.toString());
        System.out.println("\nobj1.obj:\n" + obj1.obj);
    }

    void hashCodeMethod() {  //returns hashcode of object
        System.out.println(super.hashCode());

    }

    void toStringMethod() {//returns string representation of object.getClass();
        System.out.println(super.toString());
    }


    public static void main(String[] args) throws Throwable {
        ObjectClassMethod ob = new ObjectClassMethod(10);
        ob.getClassMethod();
        ob.hashCodeMethod();
        ob.toStringMethod();


        try {
            ObjectClassMethod clone = ob.clone();
            System.out.println(clone.i);
            System.out.println(clone.equals(ob));//returns boolean for object comparison
        } catch (CloneNotSupportedException c) {

            //System.out.println("\n.............."+c);
            c.fillInStackTrace();
        }

        try {

            ob = null;
            System.out.println("null");
            //ob.finalize();// checks if object is destroyed or null
            //automatically called by the garbage collector before the object is permanently removed from the memory

            ob.finalize();

        } catch (Throwable v) {
            System.out.println(v);
        }

    }
}
