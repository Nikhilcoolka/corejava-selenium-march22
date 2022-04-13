package org.matrix.alpha.kamlesh.programs;

//Program to reverse the given String
public class Program1 {

    public static void main(String[] args) {
        //Using StringBuilder method
        String str1 = "India";
        StringBuilder obj1 = new StringBuilder(str1);
        System.out.println(obj1.reverse());


        //Using StringBuffer
        String str2 ="China";
        StringBuffer  obj2= new StringBuffer(str2);
        System.out.println(obj2.reverse());

        //Using toCharArray method
        String str3="United States";
        char[] obj3 = str3.toCharArray();
        for(int i= str3.length()-1;i>=0;i--){
            System.out.print(obj3[i]);
        }
        System.out.println();


        //Using charAt
        String str4 = "Srilanka";
        for(int i = str4.length()-1;i>=0;i--){
            System.out.print(str4.charAt(i));
        }
    }

    }







