package org.matrix.alpha.kamlesh.polymorphism.methooverloading;


// Same method name but diff parameters
public class TestOverloading {

        public void sub(int a,int b)
        {
            System.out.println(a-b);
        }
        public void sub(int a,int b,int c) {            /* these is an example of same methods name with diff parameters */

            System.out.println(a-b-c);
        }

    public static void main(String[] args) {
        TestOverloading obj = new TestOverloading();
        obj.sub(50,20);
        obj.sub(78, 90, 98);

    }
}
