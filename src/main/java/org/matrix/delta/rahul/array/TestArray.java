package org.matrix.delta.rahul.array;

public class TestArray {
    public static void main(String[] args) {
        int[] arr = new int[2];
        arr[0] = 10;
        arr[1] = 20;
        // arr[2] = 30;
        //using for loop
        for (int i = 0; i < 2; i++) {

            System.out.println(arr[i]);
        }
        System.out.println("------------------------------------------------");
        // using the for each loop

        for( int i:arr){
            System.out.println(i);
        }
        System.out.println("----------------------------------------------");
        String[] str={"rahul","Sagar","karan"};

        for(int i=0;i<3;i++){
            System.out.println(str[i]);
        }
        System.out.println("---------------------------------------");
        for( String st: str) {
            System.out.println(st);
        }
        TestCollge[] tarr = new TestCollge[3];
        TestCollge ts=new TestCollge(10,"Rahul");
        TestCollge ts1=new TestCollge(20,"Sagar");
        TestCollge ts2=new TestCollge(30,"Karan");
        tarr[0]=ts;
        tarr[1]=ts1;
        tarr[2]=ts2;




        for( TestCollge tr: tarr){
            System.out.println(tr.rollNumber+"------>"+tr.stdName);
        }
    }
}



