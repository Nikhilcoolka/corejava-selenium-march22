package org.matrix.alpha.kamlesh.programs;

//Program to reverse the given String
public class Program1 {


    public static void main(String[] args) {    //Using String Builder method
        String str = "Ananya";
        StringBuilder obj = new StringBuilder(str);
        System.out.println(" Reverse String example displaying " +obj.reverse());
        System.out.println("_______________________________________________");


        StringBuffer obj2 = new StringBuffer(str);  //Using String Buffer method
        System.out.println(" Reverse String example displaying " +obj2.reverse());

    }
}
