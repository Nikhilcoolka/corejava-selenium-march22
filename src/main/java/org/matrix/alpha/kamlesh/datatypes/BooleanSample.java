package org.matrix.alpha.kamlesh.datatypes;

public class BooleanSample {
    public boolean myfunction() {
        return false;
    }
    public static boolean myfunction2() {
        return true;
    }

    public static void main(String[] args) {
        BooleanSample sam = new BooleanSample();
        System.out.println(sam.myfunction());
        System.out.println(myfunction2());
    }
}
