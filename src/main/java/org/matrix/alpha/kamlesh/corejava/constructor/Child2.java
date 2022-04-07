package org.matrix.alpha.kamlesh.constructor;

public class Child2 extends TestChild {

    public Child2()
    {
        System.out.println("2nd child");
    }


    Child2(int n) {
        super(1);
        System.out.println("Child2 overloaded cons");
    }

    public static void main(String[] args) {      //Whenever you compile first priority goes to parent

        new Child2(1);
       // TestChild c =  new TestChild();
        //c.display();
    }

}
