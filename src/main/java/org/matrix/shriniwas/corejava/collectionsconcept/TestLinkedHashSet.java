package org.matrix.shriniwas.corejava.collectionsconcept;

import java.util.LinkedHashSet;

public class TestLinkedHashSet {

    public static void main(String[] args) {
        LinkedHashSet<String> lSet = new LinkedHashSet<>();
        lSet.add("Shri1");
        lSet.add("Shri1");
        lSet.add("Shri2");
        lSet.add("Shri3");
        lSet.add("Shri4");

        for (String str : lSet) {
            System.out.println(str);
        }
    }
}
