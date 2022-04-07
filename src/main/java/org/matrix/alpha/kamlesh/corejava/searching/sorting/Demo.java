package org.matrix.alpha.kamlesh.searching.sorting;

public class Demo {

    //linear Search program

    public int linearSearch(int[]a,int value){

        for(int i=0; i<a.length ; i++){

            if(a[i] == value){
                int j = i+1;
               // System.out.println("value is available at : "+ j + "th position" );
                return i+1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {

        int[] a = {20,30,78,90,122};
        int value = 10;
        int array_length = a.length;
        System.out.println("array length is : " + array_length);

        /*for(int i=0; i<array_length ; i++){

            if(a[i] == value){
                int j = i+1;
                System.out.println("value is available at : "+ j + "th position" );
            }else{
                System.out.println("value is not present in array");
            }

        }*/

        Demo d = new Demo();
        int result = d.linearSearch(a,value);
        if(result != -1){

        System.out.println("value is present at index : " + result);
        }
        System.out.println("value is not present");


    }
}
