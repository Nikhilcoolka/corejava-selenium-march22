package org.matrix.lambda.komal.corejava.strings;

// Strings are immutable i.e. can not change
public class StringsConcepts {


    public static void main(String[] args) {
        String str1 = "rohan";     // string literal     go in SCP  -string constant pull in heap memory's scp only
        String str2 = new String("ram");// using object creation go in Heap
        // and 2 obj created there in -1heap 2scp . obj point to heap location not scp .to show scp use below
        //str2 = str2.intern();   //it'll point to scp's value

        String str3 = "ram";
        String str4 = "ram";    // will not create new obj it'll point to same in scp.duplicates not allowed in scp
        String str5 ="ram";    // we'll create new obj in heap bt not in scp

        String str6 ="komal"; // string immutable so can't change
        // str6.concat("mane"); // it will not show komal mane but create new obj in scp i.e. mane
        str6 = str6.concat("mane"); //it'll show both. we need to store in str6 for tht
        System.out.println(str6);

        StringBuffer st = new StringBuffer("rohan");  //stringbuffer and strnig builder are muttable
        st.append("shinde");
        System.out.println("st");
    }


}
