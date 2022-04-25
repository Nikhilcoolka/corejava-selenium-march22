package org.matrix.shriniwas.corejava.collectionsconcept;

import java.util.ArrayList;

public class TestAutoBoxingUnboxing {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(10);

        // Primitive -> Object = Auto Boxing
        list.add(new Integer(10));

    }
}
