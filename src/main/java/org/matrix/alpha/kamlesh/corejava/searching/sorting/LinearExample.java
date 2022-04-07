package org.matrix.alpha.kamlesh.searching.sorting;

public class LinearExample {


    public int LinearExample(int []arr,int key){
        for(int i =0;i< arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int a1 []={10,20,30,40,50};
        int key=50;
       // System.out.println(key+"  "+LinearExample(a1,key));
    }

       /* int array[] = {5, 20, 35, 69, 78};
        int size = array.length;
        int value = 35;

        for (int i = 0; i < size - 1; i++) {
            if (array[i] == value) {
                System.out.println("Element found index is :" +i);
            }else {
                System.out.println("Element not found");
            }
        }*/

}