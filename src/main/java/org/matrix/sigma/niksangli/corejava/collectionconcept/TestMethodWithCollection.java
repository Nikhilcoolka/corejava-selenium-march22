package org.matrix.sigma.niksangli.corejava.collectionconcept;

import java.util.ArrayList;
import java.util.List;

public class TestMethodWithCollection {

   public static List<String> getListData(List<String> l)
   {
       l.add("Shri5");
       return l;
   }

    public static void main(String[] args)
    {
        List<String>l1=new ArrayList<>();
        l1.add("Shri1");
        l1.add("Shri2");
        l1.add("Shri3");
        l1.add("Shri4");
        List<String> l2=getListData(l1);

        for(String str:l2)
        {
            System.out.println(str);
        }
    }
}
