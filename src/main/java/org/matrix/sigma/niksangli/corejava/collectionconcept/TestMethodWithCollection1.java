package org.matrix.sigma.niksangli.corejava.collectionconcept;

import java.util.ArrayList;
import java.util.List;

public class TestMethodWithCollection1 {

    // how to pass parameter as collection in method
    public static List<String> getListData(List<String> l)  // return collection
    {
        l.add("Shri5");
        return l;
    }

    public static ArrayList<String> getData()   // array list is class in list interface
    {
        ArrayList<String>alist=new ArrayList<>();
        alist.add("Shri11");
        alist.add("Shri22");
        alist.add("Shri33");
        alist.add("Shri44");
        return alist;

    }

    public static void main(String[] args)
    {
        List<String>list=new ArrayList<>();
        list.add("Shri1");
        list.add("Shri2");
        list.add("Shri3");
        list.add("Shri4");

        List<String> l1=getListData(list); ///  use list and for each loop // method call
        for(String str:l1)
        {
            System.out.println(str);
        }

        ArrayList<String> alist1=getData();  /// use arraylist and for loop  // method call
        for(int i=0;i<alist1.size();i++)
        {
            System.out.println(alist1.get(i));

        }

    }
}
