package org.matrix.sigma.pankaj.StringConcept;

public class StringConcept1 {
    public static void main(String[] args) {
        String str1 = "pankaj Kurhade"; //string literal (in heap memory inside this -scp-string constnt pool memory)
        String str2 = new String("pankaj kurhade"); // by using object creation goes into heap memory
        String str3 = "Pankaj kurhade";
        String str4 = "Pankaj kurhade";
        String str5 = new String("pankaj kurhade");

        String str6 = "PANKAJ";
       str6=  str6.concat("kurhade");
        System.out.println(str6);

        StringBuffer st = new StringBuffer("pank");
        st.append("kurhade");  //stringbuffer is mutable
        System.out.println(st);

     //   String em1= "tcs";
     //   String em2= "tcs";
      //  String em3= "tcs";
      //  em3=em3.concat("wipro");


    }
}
