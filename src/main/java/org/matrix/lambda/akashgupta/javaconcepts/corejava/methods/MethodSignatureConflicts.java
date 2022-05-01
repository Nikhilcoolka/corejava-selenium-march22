package org.matrix.lambda.akashgupta.javaconcepts.corejava.methods;
/* .........Same method name creates conflicts with same class
.......can resolve by only different type of argument
 .........same arguments are also not allowed
 .......... but you can rearrange them
 ....... concept of polymorphism      */

public class MethodSignatureConflicts {
    public void sameName() {
        System.out.println("method without parameters");
    }

    //private void sameName(){} // doesn't care for access specifier
    //public int sameName(){} // doesn't care for return type
    private void sameName(int a) {
    }

    public void sameName(int a, String str) {
    }

    public String sameName(String str, int a) {
        return str;
    }

}
