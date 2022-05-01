package org.matrix.delta.ganesh.Inheritance;

public class Child extends Parent {

    public void myChild(){
        System.out.println("In Child");
        System.out.println("Method overriding in Child");
    }

    public static void main(String[] args) {
        Parent.myParent();

        Child child = new Child();
        child.myChild(10);
//        child.myParent();
        child.myChild();

    }


}
