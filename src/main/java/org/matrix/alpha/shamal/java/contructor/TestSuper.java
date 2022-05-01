package org.matrix.alpha.shamal.java.contructor;

public class TestSuper {
    // superclass

    // constructor of the superclass
    TestSuper(int version1, int version2) {

        if (version1 > version2) {
            System.out.println("The latest version is: " + version1);
        } else {
            System.out.println("The latest version is: " + version2);
        }

    }
}

