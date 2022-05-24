package org.matrix.sigma.niksangli.corejava.collectionconcept;

import java.util.LinkedHashSet;

public class TestLinkedHashSet {

    public static void main(String[] args) {
        LinkedHashSet<String>ls=new LinkedHashSet<>();
        ls.add("Ale0");
        ls.add("Ale1");
        ls.add("Ale2");
        ls.add("Ale3");

        for(String str:ls)
        {
            System.out.println(str);
        }


    }
}
