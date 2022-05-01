package org.matrix.lambda.nisha.arrayconcepts;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;

public class TestArray {

    public static void main(String[] args) {

        System.out.println("STATIC ARRAY");

       /* int arr[] = new int[3];
        int []arr = new int[3];
        int[]arr = new int[3];
        int [] arr = new int[3];*/

        // Static Array
        int arr [] = new int[3];                // 3 elements

        arr[0]=100;                     // 0th index
        arr[1]=200;                     // 1st index
        arr[2]=300;                     // 2nd index

        // Using for loop
        System.out.println("-------Using for loop------");
        for (int i=0; i<3; i++)
        {
            System.out.println(arr[i]);
           /* arr[0]=100;                     // 0th index
            arr[1]=200;                     // 1st index
            arr[2]=300;                     // 2nd index*/
        }

        // Using for each loop
        System.out.println("-------Using for each loop------");
        for (int i:arr)
        {
            System.out.println(i);
        }

        System.out.println("-------String------");
        String [] sArry = new String[2];
        sArry[0] = "Nisha";
        sArry[1] = "Deepak";
        for (String str : sArry)
        {
            System.out.println(str);
        }

        System.out.println("-------Employee data------");
        Employee []empArr = new Employee[3];
        Employee e1= new Employee("Swati",10);
        Employee e2 = new Employee("Archana",20);
        Employee e3 = new Employee("Nisha",30);

        empArr[0]= e1;
        empArr[1]= e2;
        empArr[2]= e3;

        for (Employee emp : empArr)
        {
            System.out.println(emp.empName + "--->" + emp.empId);
        }
        System.out.println("==============================================");
        for (int i=0; i<3; i++) {
            System.out.println(empArr[i].empName + "--->" + empArr[i].empId);
        }

        System.out.println("DYNAMIC ARRAY");

        // Dynamic Array
        String str [] = {"Blue", "Pink" ,"Red"};
        for (String ss : str) {
            System.out.println(ss);
        }
    }
}
