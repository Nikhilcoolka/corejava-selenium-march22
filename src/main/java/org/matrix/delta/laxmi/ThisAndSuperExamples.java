package org.matrix.delta.laxmi;

public class ThisAndSuperExamples extends JavaPractice {

    public void display() {
        System.out.println("I am in display method");
    }
    public void display2() {
       this.display();
       super.display();
        System.out.println("I am in display method2");
    }

    public static void main(String[] args) {
        ThisAndSuperExamples obj = new ThisAndSuperExamples();
        // obj.display();
        obj.display2();

    }

}
