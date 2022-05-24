package org.matrix.sigma.niksangli.corejava.collectionconcept;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Treeset {

    public static void main(String[] args) {
        Set<String> s1=new HashSet<>();  // doesnot maintain insertion order
        s1.add("Ale0");
        s1.add("Ale1");
        s1.add("Ale2");
        s1.add("Ale3");
        s1.add("Ale4");
        s1.add(null);

        HashSet<String>hs=new HashSet<>();

        for(String s2:s1)
        {
            System.out.println(s2);
        }

        Iterator<String> itr=s1.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());

        }


    }
}
