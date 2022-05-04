package org.matrix.alpha.kamlesh.objects;

public class Child extends Demo{


    public void child_display() {
        System.out.println("child");
    }

    @Override
    public void display1() {
        System.out.println("sss");
    }

    public static void main(String[] args) {

        Demo d = new Child(); // upcasting
        Child c = (Child) d; // downcasting

        System.out.println("!!!!" + d.getClass());

        d = new Child2();
        System.out.println("!!!!" + d.getClass());
    }
}
