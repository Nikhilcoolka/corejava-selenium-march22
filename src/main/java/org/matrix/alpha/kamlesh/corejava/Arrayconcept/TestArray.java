package org.matrix.alpha.kamlesh.corejava.Arrayconcept;

import org.matrix.shriniwas.corejava.Employee;

import java.sql.Array;

public class TestArray {

    public static void main(String[] args) {

        String[] arr1 = new String[4];
        System.out.println("String example");
        arr1[0] = "A";
        arr1[1] = "B";
        arr1[2] = "C";
        arr1[3] = "D";

        for (int i = 0; i <4 ; i++) {
            System.out.println(arr1[i]);
        }

        int[] arr = new int[5];
        System.out.println("Integer example using for loop");
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;

       /* for (int k = 0;k<=4;k++){
            //System.out.println(arr[k]);
        }
        System.out.println("This is using For loop method ");
*/
        for (int k:arr){
            System.out.println(k);
        }
        System.out.println("Integer example For each loop");


        Employee [] arr3= new Employee[5];
        Employee e1=new Employee("Kamal",10);
        Employee e2=new Employee("Santosh",20);
        Employee e3=new Employee("Anand",30);

        arr3[0]=e1;
        arr3[1]=e2;
        arr3[2]=e3;


        for(Employee s:arr3){
        }
    }
}