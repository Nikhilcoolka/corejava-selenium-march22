package org.matrix.lambda.akashgupta.javaconcepts.collections;

import org.matrix.lambda.akashgupta.javaconcepts.corejava.classes.Employee;

import java.util.ArrayList;
import java.util.List;

public class ArraylistTest {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();//raw use of collection.
        List al1 = new ArrayList<>();//interface reference ,raw use of collection.
        List<Integer> alInt = new ArrayList<>();//generic collection.
        Employee o = new Employee();
        /*...........................add(index),add(object)...........................................*/
        al1.add(10);
        al1.add("akash");
        al1.add(o);
        System.out.println(al1);

        /*..............................remove(object/index).............................................*/
        //al1.remove(10);  //::outofindexbound error
        al1.remove((Integer) 10);//typecast to Integer class object
        System.out.println("After removing 1 object............:");
        System.out.println(al1);
        //al1.remove(o);

        /*..........................add(index,object)................................................*/

        al1.add(1, "hello");//adds new object at index without deleting object at that index
        System.out.println("Added object at index 1.............:");
        System.out.println(al1);

        /*.......................................class methods........................................*/
        Employee ob = (Employee) al1.get(1);
        System.out.println(ob.equals(o));
        ob.getData();
        //ob.getData();    //why we can't call employee class methods/variables


        /*....................................contains(object)..........................................*/
        System.out.println(al1.contains(ob));//checks if it contains that particular object value and same datatype
        StringBuilder f = new StringBuilder("akash");
        StringBuilder g = f;
        System.out.println(al1.contains(f));//false value is same but datatype is different
        al1.add(f);
        System.out.println(al1);
        System.out.println(al1.contains(g));//true same datatype/value
        al1.add(1, 10);
        int i = 10;
        System.out.println(al1.contains(i));//true same datatype/value
        System.out.println(al1.contains(Integer.parseInt("10")));//true convert string to int

        /*.......................subList(from index ,to index(-1) ).................................*/
        System.out.println("FUll list :\n" + al1);
        System.out.println("Sublist fronm 1-3:\n" + al1.subList(1, 3));//sublist between index's

        /*......................addAll(collection)/(index,collection)..................................*/
        alInt.add(1);
        alInt.add(2);
        alInt.add(3);
        al1.addAll(alInt);
        System.out.println(al1);
        al1.addAll(0, alInt);
        System.out.println(al1);
        al1.removeAll(alInt);
        System.out.println(al1);

        /*....................................retainAll(collection)........................................*/
        al1.addAll(alInt);
        al1.retainAll(alInt);// remove all object expect provided collection elements
        System.out.println(al1);

        /*................................set(index,object)...............................................*/
        al1.set(1, 90);
        System.out.println(al1);  //reinitialize at index

        /*.............................indexOf(object)/lastIndexOf(object).................................*/
        al1.add(90);
        al1.add(1);
        System.out.println(al1);
        System.out.println("index of 1: " + al1.indexOf((Integer) 1));
        System.out.println("last index of 90: " + al1.lastIndexOf((Integer) 90));

        /*.................................isEmpty()/clear().................................*/
        al1.clear();
        System.out.println("Is list empty : " + al1.isEmpty());

    }
}
