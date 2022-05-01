package org.matrix.alpha.shamal.java.interfaceconcept;

public class TestInterface {

    public static void main(String[] args) {

        Drawable1 d = new Circle();
        d.draw();
        d.getArea();

        Drawable1 r = new Rectangle();
        r.getArea();
        r.draw();

    }
}
