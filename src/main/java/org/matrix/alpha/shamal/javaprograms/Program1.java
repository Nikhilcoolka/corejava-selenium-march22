package org.matrix.alpha.shamal.javaprograms;

public class Program1 {

    public static void main(String[] args) {

        String str = "Shamal";
        String str3 = "shrinika";

        // Using StringBulider
        StringBuilder str1 = new StringBuilder(str);
        System.out.println(str1.reverse());

        System.out.println("**************************************************************************");

        // Using StringBuffer
        StringBuffer str2 = new StringBuffer(str);
        System.out.println(str2.reverse());


        System.out.println("**************************************************************************");

        System.out.println(str.length());

        // Using toCharArray method
        char[] strChar = str.toCharArray();
        for(int i = (str.length() - 1);
                i >=0;i--)

        {
            System.out.print(strChar[i]);
        }

        // Using charAt() function
        for(
                int i = (str.length() - 1);
                i >=0;i--)

        {
            System.out.print(str.charAt(i));
        }
        System.out.println("/n");
        System.out.println("Explanation of this function");

        /* 1. First, convert String to character array by using the built in Java String class method toCharArray().
           2. Then, scan the string from end  to start, and print the character one by one.*/
        /*


        // Using Collections
        char ch1[] = str.toCharArray();
        List<Character> list = new ArrayList<Character>();

        list.add(ch);
        for(
                char ch :ch1)

        {
        }

        Collections.reverse(list);
        ListIterator<Character> listIt = list.listIterator();
        System.out.println("-- Using ListIterator --");
        while(listIt.hasNext())

        {
            System.out.print(listIt.next());
        }
          */


    }

}
