package org.matrix.omega.jagannath.corejava.arrayconcept;

public class TestArrayConcept {
    public static void main(String[] args) {
        int []arr=new int[3];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;

        //Using for loop
        System.out.println("Using for loop int Array");
        for(int i=0;i<3;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("Using for each loop int Array");
        //Using for each loop
        for (int i:arr)
        {
            System.out.println(i);
        }
   //String Array
        String []strArr=new String[2];
        strArr[0]="Shri";
        strArr[1]="Ganesh";
        //Using for loop
        System.out.println("Using for loop string Array");
        for(int i=0;i<2;i++)
        {
            System.out.println(strArr[i]);
        }
        System.out.println("Using for each loop string Array");
        //Using for each loop
        for (String str1:strArr)
        {
            System.out.println(str1);
        }
        //Student Array
        Student []stdArr=new Student[2];
        Student s1=new Student("Shri",1);
        Student s2=new Student("Ganesh",2);
        stdArr[0]=s1;
        stdArr[1]=s2;

        //Using for loop
        System.out.println("Using for loop Student Array");
        for(int i=0;i<2;i++)
        {
            System.out.println(stdArr[i].name+"------"+stdArr[i].rollno);
        }
        System.out.println("Using for each loop Student Array");
        //Using for each loop
        for (Student std:stdArr)
        {
            System.out.println(std.name+"------"+std.rollno);
        }

    }
}
