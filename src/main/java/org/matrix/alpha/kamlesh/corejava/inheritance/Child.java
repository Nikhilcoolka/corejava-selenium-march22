package org.matrix.alpha.kamlesh.inheritance;

public class Child extends Parent{
    int a=70;

    public void m1() {
        System.out.println("Child and parent ");
        System.out.println(this.a);
        System.out.println(super.a);                //Displaying through method type
        System.out.println(b);
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.m1();
        obj.m2();
        System.out.println("-----------------------");          //Displaying through main method but I cant print using
        System.out.println("Child value " +obj.a);              //using super in main method.
        System.out.println("Parent value " +obj.b);
        System.out.println("Parent value " );
    }
}
