package org.matrix.delta.ganesh.Inheritance;

public class Parent {

    public static void myParent(){
        System.out.println("In Parent");
    }

    public void myChild(){
        System.out.println("Method overriding in Parent");
    }

    public void myChild(int age){
        System.out.println("Method overriding with age parameter: "+age);
    }

    public static void main(String[] args) {
            Parent parent = new Parent();
//            parent.myParent();
//            myParent();
    }
}
