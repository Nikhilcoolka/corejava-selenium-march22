package org.matrix.alpha.kamlesh.constructor;

public class SampleConstructor {

    public SampleConstructor() {        //In constructor we dont use void or static we use public and class name
        System.out.println("Im an Sample Method Class");
        System.out.println("of");
        System.out.println("No args Constructor");
    }

    public static void main(String[] args) {
        SampleConstructor obj = new SampleConstructor();
    }
}
