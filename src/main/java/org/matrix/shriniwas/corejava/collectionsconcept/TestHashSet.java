package org.matrix.shriniwas.corejava.collectionsconcept;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestHashSet {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Shriniwas1");
        set.add("Shriniwas2");
        set.add("Shriniwas3");
        set.add("Shriniwas4");
        set.add("Shriniwas4");
        set.add(null);
        set.add(null);

        HashSet<String> hSet = new HashSet<>();

        for (String str : set) {
            System.out.println(str);
        }

        Iterator<String> itr = set.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
