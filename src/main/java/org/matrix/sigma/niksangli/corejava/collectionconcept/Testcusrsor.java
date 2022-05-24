package org.matrix.sigma.niksangli.corejava.collectionconcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Testcusrsor {

    public static void main(String[] args) {

        ArrayList<String>a1=new ArrayList<>();
        a1.add("Nik1");
        a1.add("Nik2");
        a1.add("Nik3");
        a1.add("Nik4");
        a1.add("Nik5");

        // for loop
        for(int i=0;i<a1.size();i++)
        {
            System.out.println(a1.get(i));
        }
        // for each loop

        for(String str:a1)
        {
            System.out.println(str);
        }

        // using iterator
        Iterator<String> itr=a1.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        // using list-iterator
        ListIterator<String> itr1=a1.listIterator();
        while(itr1.hasPrevious())
        {
            System.out.println(itr1.previous());
        }

    }

}
