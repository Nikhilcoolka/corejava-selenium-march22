package org.matrix.shriniwas.corejava.methods;

import java.util.*;

public class TestMethodWithCollections {

    public static List<String> getListData(List<String> l) {
        l.add("Shri5");
        return l;
    }

    public static ArrayList<String> getData() {
        ArrayList<String> aList = new ArrayList<>();
        aList.add("Shri11");
        aList.add("Shri22");
        aList.add("Shri33");
        aList.add("Shri44");
        return aList;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Shri1");
        list.add("Shri2");
        list.add("Shri3");
        list.add("Shri4");

        List<String> l1 =  getListData(list);
        for (String str : l1) {
            System.out.println(str);
        }

        // Using Iterator / ListIterator

        Iterator<String> itr = l1.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        Set<String> set = new HashSet<>();
        // set.listIterator();
        // set.iterator();

       ArrayList<String> aList1 = getData();

        for (int i = 0; i < aList1.size(); i++) {
            System.out.println(aList1.get(i));
        }
    }
}
